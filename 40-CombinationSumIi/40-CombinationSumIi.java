// Last updated: 21/07/2026, 23:15:08
class Solution {

   public void solve(int index, int target, int[] nums,
                      List<Integer> list, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < nums.length; i++) {

            if (i > index && nums[i] == nums[i - 1]) continue;

            if (nums[i] > target) break;

            list.add(nums[i]);

            solve(i + 1, target - nums[i], nums, list, result);

            list.remove(list.size() - 1);
        }
    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();

        solve(0, target, candidates, new ArrayList<>(), result);

        return result;
    }
}