import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] findFarmland(int[][] land) {
        List<int[]> groups = new ArrayList<>();
        int m = land.length;
        int n = land[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 1) {
                    int r1 = i, c1 = j;
                    int r2 = i, c2 = j;
                    while (r2 < m && land[r2][j] == 1) {
                        r2++;
                    }
                    while (c2 < n && land[i][c2] == 1) {
                        c2++;
                    }
                    r2--;
                    c2--;
                    groups.add(new int[] {r1, c1, r2, c2});
                    for (int k = r1; k <= r2; k++) {
                        for (int l = c1; l <= c2; l++) {
                            land[k][l] = 0;
                        }
                    }
                }
            }
        }
        return groups.toArray(new int[groups.size()][]);
    }
}