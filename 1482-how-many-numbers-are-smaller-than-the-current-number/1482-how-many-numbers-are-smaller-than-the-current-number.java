class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int[] temp = new int[101];
        for(int k: nums){
            temp[k]++;
        }
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums[i];j++){
                if(temp[j]>0){
                    count+=temp[j];
                }
            }
            result[i]=count;
        }
        return result;
    } 
}