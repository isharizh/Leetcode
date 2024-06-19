class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] positive = new int[nums.length / 2];
        int[] negative = new int[nums.length / 2];
        
        int pIndex = 0, nIndex = 0;
        
        // Separate positive and negative numbers
        for (int num : nums) {
            if (num > 0) {
                positive[pIndex++] = num;
            } else {
                negative[nIndex++] = num;
            }
        }
        
        // Reconstruct the array
        int[] arr = new int[nums.length];
        int i = 0, j = 0, k = 0;
        
        while (i < positive.length && j < negative.length) {
            arr[k++] = positive[i++];
            arr[k++] = negative[j++];
        }
        
        return arr;
    }
}
