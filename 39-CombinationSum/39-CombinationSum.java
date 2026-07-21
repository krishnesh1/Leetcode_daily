// Last updated: 21/07/2026, 23:15:10
class Solution {

    public void solve(int sum, int index, List<Integer> list, List<List<Integer>> result, int target, int nums[]) {
        if (sum == target) {
            result.add(new ArrayList<>(list));
            return;
        }

        if (sum > target || index >= nums.length) {
            return;
        }
        list.add(nums[index]);
        solve(sum + nums[index], index , list, result, target, nums);

        list.remove(list.size() - 1);

        solve(sum, index + 1, list, result, target, nums);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        int sum = 0;
        solve(sum, 0, list, result, target, candidates);

        return result;
    }
}