class Solution {
 public static int maxCoins(int[] piles) {
        int [] a = new int[100000];
        int sum = 0;
        for (int i = 0; i < piles.length; i++) {
            a[piles[i]]++;
        }
        int aa = piles.length - 1;
        int k = 100000;
        for (int i = 0; i < piles.length; i++) {
            if ((i + 1)  % 3 == 0) {
                continue;
            }

            for (int j = k-1; j > 0; j--) {
                if (a[j] > 0 ) {
                    if ((i + 1)  % 3 == 2) {
                        sum += j;
                    }
                    a[j]--;
                    k = j + 1;
                    break;
                }
            }
        }
        return sum;

    }
}