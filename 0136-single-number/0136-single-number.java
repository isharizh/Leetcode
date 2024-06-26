class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int a:nums){
            ans=ans^a;
        }
        System.gc();
        return ans;
    }
}