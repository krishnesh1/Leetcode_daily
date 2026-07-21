// Last updated: 21/07/2026, 23:14:17
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void print(TreeNode root, List<List<Integer>> result, List<Integer> list, int target, int sum) {

        if (root == null)
            return;

        list.add(root.val);
        sum += root.val;

        if (root.left == null && root.right == null) {
            if (sum == target) {
                result.add(new ArrayList<>(list));
            }
        } else {
            print(root.left, result, list, target, sum);
            print(root.right, result, list, target, sum);
        }
        list.remove(list.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> result = new LinkedList<>();
        List<Integer> list = new LinkedList<>();

        print(root, result, list, targetSum, 0);
        return result;
    }
}