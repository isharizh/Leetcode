class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
            arr.add(rev(nums[i]));
        }
        return arr.size();
    }

    public static int rev(int n){
        int rev = 0;
        while(n!=0){
            int rem = n %10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        return rev;
    }
}