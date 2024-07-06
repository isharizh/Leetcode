class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int count =0;
        boolean m=false,g=false,p=false;
        for(int i=garbage.length-1;i>=0;i--){
            count +=garbage[i].length();
            if(!m) m=garbage[i].contains("M");
            if(!g) g=garbage[i].contains("G");
            if(!p) p=garbage[i].contains("P");
            if(i>0){
                count += travel[i-1]*((m?1:0)+(p?1:0)+(g?1:0));
            }
        }
        return count;
    }
}