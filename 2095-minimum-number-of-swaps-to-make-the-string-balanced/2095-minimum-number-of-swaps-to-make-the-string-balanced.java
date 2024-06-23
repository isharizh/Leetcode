class Solution {
    public int minSwaps(String s) {
        int count = 0;
        int swap = 0;
        for(char c : s.toCharArray()){
            if(c == '['){
                count++;
            }
            else if(c == ']'){
                count--;
            }if(count==-1){
                swap++;
                count +=2;
            }
        }
        System.gc();
        return swap;
    }
}