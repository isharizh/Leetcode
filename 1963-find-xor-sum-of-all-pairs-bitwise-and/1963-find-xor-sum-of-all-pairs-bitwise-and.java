class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int arr1xor = 0;
        int arr2xor = 0;

        for(int i=0;i<arr1.length;i++){
            arr1xor ^= arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr2xor ^= arr2[i];
        }
        return arr1xor & arr2xor;
    }
}