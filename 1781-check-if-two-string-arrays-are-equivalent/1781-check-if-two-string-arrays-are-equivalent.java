class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer str1 = new StringBuffer();
        for(String s : word1){
            str1.append(s);
        }

        StringBuffer str2 = new StringBuffer();
        for(String s : word2){
            str2.append(s);
        }

        System.out.println(str1);
        System.out.println(str2);
        if(str1.toString().equals(str2.toString())){
            return true;
        }
        return false;

    }
}