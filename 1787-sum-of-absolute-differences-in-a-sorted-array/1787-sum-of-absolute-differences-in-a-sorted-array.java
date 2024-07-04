class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] arr = new int[nums.length];
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
        }
        int c = nums.length;
        for(int i = 0;i<nums.length;i++){
            arr[i] = sum - c * nums[i];
            sum = sum - 2 * nums[i];
            c -=2;
        }
        return arr;
    }
}