class Solution {
    public int[] rearrangeArray(int[] nums) {
        int e = 0, o = 1;
        int arr[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){
                if(nums[i] > 0){
                    arr[e] = nums[i];
                    e += 2;
                    continue;
                }else{
                if(nums[i]<0){
                    arr[o] = nums[i];
                    o += 2;
                    continue;
                }
            }
        }
        return arr;
    }
}