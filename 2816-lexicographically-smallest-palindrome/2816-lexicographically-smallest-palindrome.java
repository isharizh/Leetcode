class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int l = 0;
        int r = chars.length - 1;
        while(l < r) {
            int min = Math.min(chars[l],chars[r]);
            chars[l++] = chars[r--] = (char)min;
        }
        return new String(chars);
    }
}