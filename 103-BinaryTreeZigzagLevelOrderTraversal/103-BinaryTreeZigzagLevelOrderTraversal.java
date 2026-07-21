// Last updated: 21/07/2026, 23:14:26
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag=true;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>level = new ArrayList<>();
            Stack<Integer> st = new Stack<>();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                if(flag) level.add(temp.val);
                else st.push(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            while(!st.empty()){
                level.add(st.pop());
            }
            flag=!flag;
            result.add(level);
        }
        return result;
    }
}