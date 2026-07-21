// Last updated: 21/07/2026, 23:14:55
class Solution {
    public int maxSubArray(int[] nums) {

        int sum = 0;

        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;

    }
}