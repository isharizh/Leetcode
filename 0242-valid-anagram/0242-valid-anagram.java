class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[] = new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(char c : s.toCharArray()){
            arr[c - 'a']++;
        }
        for(char c : t.toCharArray()){
            if(arr[c - 'a']== 0){
                return false;
            }
            arr[c - 'a']--;
        }
        System.gc();
        return true;
    }
}