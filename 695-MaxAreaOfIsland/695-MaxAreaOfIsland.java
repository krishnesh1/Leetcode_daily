// Last updated: 21/07/2026, 23:12:04
class Solution {

    int cnt = 0;

    void dfs(int[][] grid, int i, int j) {

        int n = grid.length;
        int m = grid[0].length;
        if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == 0)
            return;

        grid[i][j] = 0;
        cnt++;
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);

    }

    public int maxAreaOfIsland(int[][] grid) {

        int max=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                cnt=0;
                if (grid[i][j] == 1) {
                    dfs(grid, i, j);
                }
                max=Math.max(max,cnt);
            }
        }
        return max;
    }
}