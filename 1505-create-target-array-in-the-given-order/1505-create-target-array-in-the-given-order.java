class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int tar[] = new int[index.length];
       
        for(int i=0;i<nums.length;i++){
            for(int j=tar.length-1;j>index[i];j--){
                tar[j] = tar[j-1];
            }
            tar[index[i]] = nums[i];
       } 
       return tar;
    }
}