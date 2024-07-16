class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int prev = 0, current = 0;
        
        for (int count = 0; count <= (nums1.length + nums2.length)/2; count++) {
            prev = current;
            if (i < nums1.length && (j >= nums2.length || nums1[i] <= nums2[j])) {
                current = nums1[i++];
            } else {
                current = nums2[j++];
            }
        }
        
        if ((nums1.length + nums2.length) % 2 == 0) {
            return (prev + current) / 2.0;
        } else {
            return current;
        }
    }
}
