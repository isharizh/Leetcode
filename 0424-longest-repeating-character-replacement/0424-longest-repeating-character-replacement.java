class Solution {
    public int characterReplacement(String s, int k) {
        int ans=0;
        int maxcount=0;
        int []count=new int[26];
        for(int l=0,r=0;r<s.length();++r){
            maxcount=Math.max(maxcount,++count[s.charAt(r)-'A']);
            while(maxcount + k<r-l+1){
                --count[s.charAt(l++)-'A'];
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans; 
    }
}