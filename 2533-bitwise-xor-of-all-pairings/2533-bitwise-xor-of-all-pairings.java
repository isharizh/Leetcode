class Solution {
    public int xor(int[] a) {
        int ans = 0;
        for(int n: a) {
            ans ^= n;
        }
        return ans;
    }
    
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(n1%2==0 && n2%2==0) {
            return 0;
        }
        if(n1%2==1 && n2%2==1) {
            return xor(nums1)^xor(nums2);
        }
        
        if(n1%2==0) {
            return xor(nums1);
        }
        
        return xor(nums2);
    }
}