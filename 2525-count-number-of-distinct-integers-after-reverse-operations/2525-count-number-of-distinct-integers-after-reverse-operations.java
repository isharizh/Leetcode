class Solution {
    public int countDistinctIntegers(int[] nums) {
        int count=0;
        boolean arr[]=new boolean[1000001];
        for(int num:nums){
           if(!arr[num]){
            arr[num]=true;
            count++;
           }
           int s=0;
           while(num>0){
            s=s*10+num%10;
            num/=10;
           }
           if(!arr[s]){
            arr[s]=true;
            count++;
           }

        }return count;
    }
}