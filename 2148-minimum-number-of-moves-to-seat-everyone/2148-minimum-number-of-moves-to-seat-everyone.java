class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int moves1[] = new int[101];
        int moves2[] = new int[101];
        Arrays.fill(moves1,0);
        Arrays.fill(moves2,0);
        int n = seats.length;
        for (int seat : seats) {
            moves1[seat]++;
        }
        for (int student : students) {
            moves2[student]++;
        }
        int moves=0;int j=0,i=0;
        //counting sort
        while(n>0){
            if(moves1[i]==0 ) i++;
            if(moves2[j]==0 ) j++;
            
            if(moves1[i]!=0 && moves2[j]!=0){
                moves+=Math.abs(i-j);
                moves1[i]--; //can be multiple seats remove frequency
                moves2[j]--;
                n--;
            }
        }
        return moves;
    }
}