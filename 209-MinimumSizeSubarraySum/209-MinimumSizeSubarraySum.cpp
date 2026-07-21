// Last updated: 21/07/2026, 23:13:22
class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int i = 0, j = 0;
        int sum = 0;
        int mini = INT_MAX;

        while (j < nums.size()) {
            sum += nums[j];

            // shrink window while sum >= target
            while (sum >= target) {
                mini = min(mini, j - i + 1);
                sum -= nums[i];
                i++;
            }

            j++;
        }

        return (mini == INT_MAX) ? 0 : mini;
    }
};
