// Last updated: 21/07/2026, 23:14:20
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
    public boolean print(TreeNode root,List<Integer>list,int sum , int targetSum){
        if(root == null) return false;

        list.add(root.val);
        sum+=root.val;

        if(root.left == null && root.right == null){
            if(sum==targetSum){
                return true;
            }
        }

        boolean left = print(root.left,list,sum,targetSum);
        boolean right = print(root.right,list,sum,targetSum);

        list.remove(list.size()-1);

        return left || right;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer> list = new LinkedList<>();
        return print(root, list, 0, targetSum);
    }
}