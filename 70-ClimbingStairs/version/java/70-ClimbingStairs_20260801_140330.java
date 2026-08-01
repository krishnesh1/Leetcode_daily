// Last updated: 01/08/2026, 14:03:30
1class Solution {
2    public int climbStairs(int n) {
3
4        if(n<=2) return n;
5
6        int []dp = new int[n+1];
7
8        dp[1] = 1;
9        dp[2] = 2;
10
11        for(int i=3;i<=n;i++){
12            dp[i] = dp[i-1]+dp[i-2];
13        }
14
15        return dp[n];
16    }
17}