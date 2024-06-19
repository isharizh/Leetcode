class Solution {
    public int[] rearrangeArray(int[] nums) {
       int p[]=new int[nums.length/2];
       int n[]=new int[nums.length/2];
       int j=0;int k=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]>0)
            p[j++]=nums[i];
            else
            n[k++]=nums[i];
       }
       int f=0;
        for(int i =0;i<nums.length/2;i++){
            nums[f++]=p[i];
            nums[f++]=n[i];
        }
        return nums;
    }
}