class Solution {
    public long maximumHappinessSum(int[] h, int k) {
        long max=0;
        int d=0;
        int ans=0;
        Arrays.sort(h);
        for(int i=h.length-1;i>=h.length-k;i--){
            ans = h[i]-d++;
            if(ans>0){
                max += ans;
            }
        }
        return max;
    }
}    