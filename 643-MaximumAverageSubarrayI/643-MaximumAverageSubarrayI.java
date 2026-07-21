// Last updated: 21/07/2026, 23:12:07
class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        double sum = 0;

        // first window sum
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;

        //  slide window
        for (int i = k; i < n; i++) {
            sum = sum + nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum / k;
    }
}