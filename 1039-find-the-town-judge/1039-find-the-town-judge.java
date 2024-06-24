class Solution {
    public int findJudge(int n, int[][] trust) {
        int ind[] = new int[n+1];
        int out[] = new int[n+1];
        if(n==1 && trust.length==0){
            return 1;
        }else if(n==2 && trust.length==0){
            return -1;
        }
        
        for(int i=0;i<trust.length;i++){
            ind[trust[i][1]]++;
            out[trust[i][0]]++;
        }
        for(int i=0;i<n+1;i++){
            if(out[i]==0 && ind[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}