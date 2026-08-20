// Last updated: 20/08/2026, 17:48:53
1class Solution {
2public int[] twoSum(int[] nums, int target) {
3    int[] result = new int[2];
4    for (int i = 0; i < nums.length; i++) {
5        for (int j = i + 1; j < nums.length; j++) {
6            if (nums[i] + nums[j] == target) {
7                result[0] = i;
8                result[1] = j;
9                return result;
10            }
11        }
12    }
13    return result;
14 }
15} 