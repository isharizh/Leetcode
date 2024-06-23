class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer>r=new LinkedList<>();
        Queue<Integer>d=new LinkedList<>();
        int n=senate.length();
        for(int i=0;i<senate.length();i++){
            if(senate.charAt(i)=='R')    r.add(i);
            else   d.add(i);
        }
        while(!r.isEmpty()&&!d.isEmpty()){
            int ridx=r.peek();
            int didx=d.peek();
            r.poll();
            d.poll();
            if(ridx<didx){
                r.add(ridx+n);
            }
            else{
                d.add(didx+n);
            }
        }
        return r.isEmpty() ? "Dire" : "Radiant";
    }
}