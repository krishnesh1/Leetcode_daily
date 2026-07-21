// Last updated: 21/07/2026, 23:14:58
import java.util.*;

class Solution {
    int res = 0;

    public boolean isSafe(int[][] grid, int r, int c, int N) {

        // left-up diagonal
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (grid[i][j] == 1) return false;
        }

        // up (same column)
        for (int i = r - 1; i >= 0; i--) {
            if (grid[i][c] == 1) return false;
        }

        // right-up diagonal
        for (int i = r - 1, j = c + 1; i >= 0 && j < N; i--, j++) {
            if (grid[i][j] == 1) return false;
        }

        return true;
    }

    public void solution(int[][] grid, int row, int N, List<List<String>> ans) {
        if (row == N) {
            List<String> temp = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < N; j++) {
                    sb.append(grid[i][j] == 1 ? 'Q' : '.');
                }
                temp.add(sb.toString());
            }

            ans.add(temp);
            return;
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(grid, row, col, N)) {
                grid[row][col] = 1;
                solution(grid, row + 1, N, ans);
                grid[row][col] = 0; // backtrack
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        int[][] grid = new int[n][n];
        List<List<String>> ans = new ArrayList<>();

        solution(grid, 0, n, ans);
        return ans;
    }
}
