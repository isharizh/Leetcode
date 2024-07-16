class Solution {
        private int start, maxLength;

    public String longestPalindrome(String s) {
            if (s.length() < 2) {
            return s;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            extendPalindrome(s, i, i);  // Assume odd length
            extendPalindrome(s, i, i + 1); // Assume even length
        }
        return s.substring(start, start + maxLength);
    }

    public void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLength < k - j - 1) {
            start = j + 1;
            maxLength = k - j - 1;
        }
    }
}