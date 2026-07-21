// Last updated: 21/07/2026, 23:11:34
class Solution {
    public int sol(int[] days, int[] cost, int id, int[] dp) {

        if (id == days.length) return 0;
        if (dp[id] != -1) return dp[id];

        // 1-day pass
        int a = cost[0] + sol(days, cost, id + 1, dp);

        // 7-day pass
        int i = id;  // starting from current index
        while (i < days.length && days[i] <= days[id] + 6) {
            i++;
        }
        int b = cost[1] + sol(days, cost, i, dp);

        // 30-day pass
        i = id;  // reset i
        while (i < days.length && days[i] <= days[id] + 29) {
            i++;
        }
        int c = cost[2] + sol(days, cost, i, dp);

        return dp[id] = Math.min(a, Math.min(b, c));
    }

    public int mincostTickets(int[] days, int[] costs) {

        int[] dp = new int[days.length];
        Arrays.fill(dp, -1);

        return sol(days, costs, 0, dp);
    }
}
