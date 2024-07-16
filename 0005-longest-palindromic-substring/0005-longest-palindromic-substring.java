class Solution {
    private int start, maxLength;

    public String longestPalindrome(String s) {
        if(s.length()<2){
            return s;
        }
        start = 0;
        maxLength = 1;
        for(int i=0;i<s.length()-1;i++){
            extend(s,i,i);
            extend(s,i,i+1);
        }
        return s.substring(start, start + maxLength);
    }

    public void extend(String s, int j, int k){
        while( j>=0 && k<s.length() && s.charAt(j)== s.charAt(k)){
            j--;
            k++;
        }
        if(maxLength<k-j-1){
            start = j+1;
            maxLength = k-j-1;
        }
    }
}