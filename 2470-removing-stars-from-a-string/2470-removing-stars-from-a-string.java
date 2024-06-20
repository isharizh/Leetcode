class Solution {
    public String removeStars(String s) {
        int len = s.length();
        byte[] w = new byte[len];
        s.getBytes(0, len, w, 0);
        int j=0;
        for (int i = 0; i < len; i++) {
            if (w[i] == 42)
                j--;
            else
                w[j++] = w[i];
        }
        return (new String(w, 0, j));
    }
}