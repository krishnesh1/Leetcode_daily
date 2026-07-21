// Last updated: 21/07/2026, 23:13:19
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int j = i + 1;

            while (j < n && j <= i + k) {

                if (nums[i] == nums[j]) {
                    return true;
                }

                j++;
            }
        }

        return false;
    }
}