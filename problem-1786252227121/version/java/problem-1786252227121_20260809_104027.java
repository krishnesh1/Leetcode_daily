// Last updated: 09/08/2026, 10:40:27
1class Solution {
2    public int climbStairs(int n) {
3
4        if (n < 2)
5            return n;
6
7        int[] dp = new int[n + 1];
8        dp[1] = 1;
9        dp[2] = 2;
10
11        for(int i=3;i<=n;i++){
12            dp[i]=dp[i-1]+dp[i-2];
13        }
14        return dp[n];
15
16    }
17}