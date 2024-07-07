class Solution {
    public static boolean contains(int[] arr, int number) {
        for (int n : arr) {
            if (n == number) {
                return true;
            }
        }
        return false;
    }
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int ans = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if((contains(nums2, nums1[i])) || (contains(nums3, nums1[i]))){
                if(!list.contains(nums1[i])){
                    list.add(nums1[i]);
                }
            }
        }

        for(int i=0;i<nums2.length;i++){
            if((contains(nums1, nums2[i])) || (contains(nums3, nums2[i]))){
                if(!list.contains(nums2[i])){
                    list.add(nums2[i]);
                }
            }
        }
        for(int i=0;i<nums3.length;i++){
            if((contains(nums1, nums3[i])) || (contains(nums2,nums3[i]))){
                if(!list.contains(nums3[i])){
                    list.add(nums3[i]);
                }
            }
        }
        return list;
    }
}