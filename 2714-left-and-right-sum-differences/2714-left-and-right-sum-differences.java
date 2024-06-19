class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ans[] = new int[nums.length];
        if(nums.length == 0){
            ans[0] = 0; 
            return ans;
        }
        int lsum[] = new int[nums.length];
        int rsum[] = new int[nums.length];

        lsum[0] = 0;
        for(int i=1;i<nums.length;i++){
            lsum[i] = lsum[i-1]+nums[i-1];
        }

        rsum[nums.length - 1] = 0;
        for(int i=nums.length-2;i>=0;i--){
            rsum[i] = rsum[i+1]+nums[i+1];
        }

        for(int i=0;i<nums.length;i++){
            ans[i] = Math.abs(lsum[i]-rsum[i]);
        }
        System.gc();
        return ans;
    }
}