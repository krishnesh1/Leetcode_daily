// Last updated: 21/07/2026, 23:12:48
class Solution {
    int sol(int [] coins,int amt,int []dp){

        if(amt==0) return 0;
        if(dp[amt]!=-1) return dp[amt];

        int min=10001;
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amt){ 
                min=Math.min(min,1+sol(coins,amt-coins[i],dp));
            }
        }
        dp[amt]=min;
        return dp[amt];
        
    }
    public int coinChange(int[] coins, int amount) {
        
        int [] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        int ans = sol(coins,amount,dp);
        return dp[amount] >=10001 ? -1 : ans;
    }
}