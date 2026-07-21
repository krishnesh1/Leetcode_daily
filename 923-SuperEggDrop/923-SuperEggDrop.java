// Last updated: 21/07/2026, 23:11:46
class Solution {

    public int egg(int n,int k,int [][] dp){
        if(n==0 || k==0 ) return 0;
        if(dp[n][k]!=-1) return dp[n][k];

        return dp[n][k]=1+egg(n-1,k-1,dp)+ egg(n-1,k,dp);
    }
    public int superEggDrop(int k, int n) {
        
        int [][]dp = new int[n+1][k+1];
        
        for(int [] temp:dp) Arrays.fill(temp,-1);
        int result=0;
        for(int i=1;i<=n;i++){
            if(egg(i,k,dp)>=n){
                result=i;
                break;
            }
        }

     return result;
    }
}