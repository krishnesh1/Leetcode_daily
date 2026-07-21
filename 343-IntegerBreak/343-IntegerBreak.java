// Last updated: 21/07/2026, 23:12:43
class Solution {

    int sol(int n, int[] dp) {

        if (n == 1) return 1;

        if (dp[n] != -1) return dp[n];

        int res = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {

            int first = i * (n - i);       // break into two parts
            int second = i * sol(n - i, dp); // break n-i further or not

            res = Math.max(res, Math.max(first, second));
        }

        dp[n] = res;
        return res;
    }

    public int integerBreak(int n) {

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return sol(n, dp);
    }
}
