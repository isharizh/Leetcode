class Solution {
    public int[] minOperations(String boxes) {

        int n = boxes.length();
        char ch[] = boxes.toCharArray();
        int[] ans = new int[n];

        int[] left = new int[n];
        int count = ch[0]-'0';

        for(int i =1;i<n;i++){
            left[i] = left[i-1]+count;
            count+=ch[i]-'0';


        }

        int[] right = new int[n];
         count = ch[n-1]-'0';

        for(int i =n-2;i>=0;i--){
            right[i] =right[i+1]+count;
            count+=ch[i]-'0';
        }
        

      for(int i =0;i<n;i++){

        ans[i] = left[i]+right[i];
      }
      System.gc();
      return ans;
    }
}