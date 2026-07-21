// Last updated: 21/07/2026, 23:12:00
class Solution {


    public int recursive(int n,int[] fr,int []dp){
        if(n<=0) return 0;
        if(dp[n]!=-1) return dp[n];

        int pick = n*fr[n]+recursive(n-2,fr,dp);
        int skip = recursive(n-1,fr,dp);

        dp[n]= Math.max(pick,skip);

        return dp[n];
    }
    public int deleteAndEarn(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        for(int a: nums) max = Math.max(max,a);

        int [] fr = new int [max+1];
        int [] dp = new int[max+1];

        for(int i=0;i<nums.length;i++){
            fr[nums[i]]++;
        }

        Arrays.fill(dp,-1);
        
        int res = recursive(max,fr,dp);
        return res;
    }
};