class Solution {
    public int largestCombination(int[] candidates) {
        int arr[] = new int[32];
        for(int i=0;i<candidates.length;i++){
            for(int j=0;j<32;j++){
                int temp = candidates[i]&(1<<j);
                if(temp!=0){
                    arr[j]+=1;
                }
            }
        }
        int lar = Integer.MIN_VALUE;
        for(int i=0;i<32;i++){
            lar = Math.max(lar,arr[i]);
        }
        return lar;

    }
}