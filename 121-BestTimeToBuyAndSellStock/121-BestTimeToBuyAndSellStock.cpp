// Last updated: 21/07/2026, 23:14:19
class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n=prices.size();
        int mini=prices[0];
        int profit=0,cost=0;
        for(int i=1;i<n;i++){
            cost = prices[i]-mini;
            profit=max(profit,cost);
            mini=min(prices[i],mini);
        }
        return profit;
    }
};