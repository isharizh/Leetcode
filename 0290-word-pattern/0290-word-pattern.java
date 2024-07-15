class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length!= pattern.length()){
            return false;
        }
        HashMap<Character,  String> ctw = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if(ctw.containsKey(c)){
                if(!ctw.get(c).equals(word)){
                    return false;
                }
            }else{
                if(ctw.containsValue(word)){
                    return false;
                }
                ctw.put(c, word);
            }
        }
        return true;
    }
}