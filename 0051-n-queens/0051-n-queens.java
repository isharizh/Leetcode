class Solution {
    public static boolean isSafe(int x, int y, int [][] board, int n) {
        // Check column
        for (int row = 0; row < x; row++) {
            if (board[row][y] == 1) {
                return false;
            }
        }
        // Check upper-left diagonal
        for (int row = x, col = y; row >= 0 && col >= 0; row--, col--) {
            if (board[row][col] == 1) {
                return false;
            }
        }
        // Check upper-right diagonal
        for (int row = x, col = y; row >= 0 && col < n; row--, col++) {
            if (board[row][col] == 1) {
                return false;
            }
        }
        return true;
    }
    public static void addSolution(int [][] board, List<List<String>> ans, int n) {
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    sb.append('.');
                } else {
                    sb.append('Q');
                }
            }
            temp.add(sb.toString());
        }
        ans.add(temp);
    }
    public static void solve(int row, List<List<String>> ans, int [][] board, int n) {
        if (row == n) {
            addSolution(board, ans, n);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board, n)) {
                board[row][col]=1;
                solve(row + 1, ans, board, n);
                board[row][col]=0;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        int [][] board = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]=0;
            }
        }
        List<List<String>> ans = new ArrayList<>();
        solve(0, ans, board, n);
        return  ans;
    }
}