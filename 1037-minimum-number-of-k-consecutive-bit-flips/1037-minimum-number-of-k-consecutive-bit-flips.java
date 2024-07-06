class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int c = 0;
        int flip = 0;
        int[] isFlipped = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            if (i >= k)
                flip ^= isFlipped[i - k];
                if (flip == nums[i]) {
                    if (i + k > nums.length){
                        return -1;
                    }
                isFlipped[i] = 1;
                flip ^= 1;
                c++;
            }
        }
        return c;
    }
}