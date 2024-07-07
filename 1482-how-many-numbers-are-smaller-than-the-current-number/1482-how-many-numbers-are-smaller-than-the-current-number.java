class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans = 0;
        int arr[] = new int[nums.length];
        int i = 0;
        int j = 0;
        while(i<nums.length){
            if(j==nums.length){
                j=0;
                arr[i] = ans;
                i++;
                ans = 0;
                continue;
            }
            if(nums[j] < nums[i]){
                ans++;
            }
            j++;
        }
        return arr;
    }
}