// Last updated: 21/07/2026, 23:12:30
class Solution {
    int cnt = 0;

    public int findTargetSumWays(int[] nums, int target) {
        backtrack(nums, 0, 0, target);
        return cnt;
    }

    void backtrack(int[] nums, int index, int sum, int target) {

        if (index == nums.length) {
            if (sum == target)
                cnt++;
            return;
        }

        backtrack(nums, index + 1, sum + nums[index], target);
        backtrack(nums, index + 1, sum - nums[index], target);
    }
}