class Solution {
    public int minCost(String colors, int[] neededTime) {
        int count = 0;
        for(int i=0;i<neededTime.length-1;i++){
            if(colors.charAt(i)== colors.charAt(i+1)){
                    count += Math.min(neededTime[i], neededTime[i+1]);
                    neededTime[i+1] = Math.max(neededTime[i], neededTime[i+1]);
            }
        }
        return count;
    }
}