class Solution {
    public int largestCombination(int[] candidates) {
        int max = 0;
        for (int i = 0; i < 24; i++) {
            int count = 0;
            for (int n : candidates) {
                count += ((n >> i) & 0x1);
            }
            if (count > max) {
                max = count;
            }
        }
        
        return max;
    }
}