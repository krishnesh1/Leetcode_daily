// Last updated: 21/07/2026, 23:14:46
class Solution {

    public int f(int i, int j, String word1, String word2, int[][] dp) {

        // word1 finished
        if (i < 0) {
            return j + 1;
        }

        // word2 finished
        if (j < 0) {
            return i + 1;
        }

        // already computed
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // characters same
        if (word1.charAt(i) == word2.charAt(j)) {

            return dp[i][j] = f(i - 1, j - 1, word1, word2, dp);
        }

        // insert
        int insert = f(i, j - 1, word1, word2, dp);

        // delete
        int delete = f(i - 1, j, word1, word2, dp);

        // replace
        int replace = f(i - 1, j - 1, word1, word2, dp);

        return dp[i][j] = 1 + Math.min(insert,
                               Math.min(delete, replace));
    }

    public int minDistance(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        int[][] dp = new int[n][m];

        for (int[] row : dp) {
            java.util.Arrays.fill(row, -1);
        }

        return f(n - 1, m - 1, word1, word2, dp);
    }
}