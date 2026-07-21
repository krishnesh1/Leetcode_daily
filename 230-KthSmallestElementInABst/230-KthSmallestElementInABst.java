// Last updated: 21/07/2026, 23:13:12
class Solution {

    int cnt = 0;
    int ans = -1;

    public int kthSmallest(TreeNode root, int k) {
        cnt = 0;   
        ans = -1;

        inorder(root, k);
        return ans;
    }

    public void inorder(TreeNode root, int k) {
        
        if (root == null) return;

        inorder(root.left, k);

        cnt++;
        if (cnt == k) {
            ans = root.val;
            return;  
        }

        inorder(root.right, k);
    }
}