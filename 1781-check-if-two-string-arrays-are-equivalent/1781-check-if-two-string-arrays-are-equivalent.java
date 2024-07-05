class Solution {
    public String join(String[] arr){
        StringBuilder str1 = new StringBuilder();
        for(String s : arr){
            str1.append(s);
        }
        return str1.toString();
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return join(word1).equals(join(word2));
    }
}