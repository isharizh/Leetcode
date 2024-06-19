class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int bob = piles.length/3;
        int sum=0;
        for(int i=bob;i<piles.length;i+=2){
            sum += piles[i];
        }
        return sum;
    }
}