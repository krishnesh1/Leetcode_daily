// Last updated: 21/07/2026, 23:12:55
class Solution {

    public int sol(int n,int [] dp){

        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];

        int res= Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            res = Math.min(res,1+sol(n-i*i,dp));
        }

        dp[n]=res;
        return dp[n];
    }
    public int numSquares(int n) {
        
        int [] dp = new int [n+1];
        Arrays.fill(dp,-1);

        return sol(n,dp);
    }
}