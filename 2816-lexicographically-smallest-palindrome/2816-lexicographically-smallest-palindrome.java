class Solution {
    public String makeSmallestPalindrome(String s) {
        char arr[] = s.toCharArray();
        int n = arr.length-1;
        int i=0;
        while(i<=n){
            if(arr[i]<arr[n]){
                arr[n--] = arr[i++];
            }else{
                arr[i++] = arr[n--];
            }
        }
        return new String(arr);
    }
}