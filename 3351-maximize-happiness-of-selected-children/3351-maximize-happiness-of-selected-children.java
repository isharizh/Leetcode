class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long sum = 0;
        int p = 0;
        Arrays.sort(happiness);
        for(int i=happiness.length-1;i>=happiness.length-k;i--){
            if((happiness[i]-p)>0){
                happiness[i] -= p;
                sum = sum + happiness[i];
                p++;
            }
        }
        return sum;
    }
}