class Solution {
    public boolean palin(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public String firstPalindrome(String[] words) {
        for(String str: words){
            if(palin(str)) return str;
        }
        return "";
    }
}