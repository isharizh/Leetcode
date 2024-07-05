class Solution {
    public int sumOfUnique(int[] nums) {
        int ans = 0;
        int arr[] = new int[101];
        Arrays.fill(arr,0);
        for(int i=0;i<nums.length;i++){
            arr[nums[i]] += 1;
        }
        for(int i=0;i<101;i++){
            if(arr[i]==1){
                ans += i;
            }
        }
        return ans;
    }
}