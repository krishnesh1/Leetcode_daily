// Last updated: 21/07/2026, 23:14:12
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int mini = prices[0];
        int profit = 0, cost = 0;
        for (int i = 1; i < n; i++) {
            cost = prices[i] - mini;
            profit =Math.max(profit, cost);
            mini = Math.min(prices[i], mini);
        }
        return profit;
    }
}