class Solution {
    public int minOperations(int[] nums) {
        int c = 0;
        int flip = 0;
        for(int i : nums){
            if(i == flip){
                c++;
                flip = 1 - flip;
            }
        }
        return c;
    }
}