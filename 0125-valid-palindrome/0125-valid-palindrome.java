class Solution {
    public boolean isPalindrome(String s) {
        
        int i=0, j=s.length()-1;
        while(i<j){
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(!isAlpha(a) && !isNumeric(a)){
                i++;
                continue;
            }
            if(!isAlpha(b) && !isNumeric(b)){
                j--;
                continue;
            }
            if(isUpperCase(a)) a+=32;
            if(isUpperCase(b)) b+=32;
            if(a!=b) return false;
            i++;
            j--;
        }
        return true;
    }

    boolean isUpperCase(char c) {
        return c >= 65 && c <= 90;
    }

    boolean isNumeric(char c) {
        return c >= 48 && c <= 57;
    }

    boolean isAlpha(char c) {
        return (c>='A' && c<='Z') || (c>='a' && c<='z');
    }
}