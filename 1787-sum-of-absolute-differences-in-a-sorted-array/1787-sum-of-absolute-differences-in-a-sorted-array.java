class Solution {
    public int[] getSumAbsoluteDifferences(int[] arr) {
        int size=arr.length;
        int pre_fix[] = new int[size];
        for(int i=size-1;i>=0;i--){
            if(i==size-1){
                pre_fix[i]=arr[i];
            }
            else pre_fix[i]=arr[i]+pre_fix[i+1];
        }
        int ans[] = new int[size];
        for(int i=0;i<size;i++){
           int left=Math.abs(i*arr[i]-(pre_fix[0]-pre_fix[i]));
           int right=Math.abs((size-i-1)*arr[i]-(pre_fix[i]-arr[i]));
           ans[i]=left+right;
        }
        return ans;
        
    }
}