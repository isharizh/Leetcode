class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int count = 0;
        int mT= 0, pT = 0, gT = 0;
        int lM = 0, lP = 0, lG = 0;
        
        for (int i = 0; i < garbage.length; i++) {
            if (garbage[i].indexOf('M') != -1) {
                long mCount = garbage[i].chars().filter(ch -> ch == 'M').count();
                mT += mCount;
                lM = i;
            }
            if (garbage[i].indexOf('P') != -1) {
                long pCount = garbage[i].chars().filter(ch -> ch == 'P').count();
                pT += pCount;
                lP = i;
            }
            if (garbage[i].indexOf('G') != -1) {
                long gCount = garbage[i].chars().filter(ch -> ch == 'G').count();
                gT += gCount;
                lG = i;
            }
        }
        
        for (int i = 0; i < lM; i++) {
            mT += travel[i];
        }
        for (int i = 0; i < lP; i++) {
            pT += travel[i];
        }
        for (int i = 0; i < lG; i++) {
            gT += travel[i];
        }
        
        count = mT + pT + gT;
        return count;
    }
}
