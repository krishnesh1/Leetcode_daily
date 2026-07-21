// Last updated: 21/07/2026, 23:14:23
import java.util.*;

class Solution {

    HashMap<Integer,Integer> map = new HashMap<>();
    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }

        return helper(preorder, 0, inorder.length - 1);
    }

    public TreeNode helper(int[] preorder, int start, int end){

        if(start > end) return null;

        int val = preorder[preIndex++];
        TreeNode root = new TreeNode(val);

        int index = map.get(val);

        root.left = helper(preorder, start, index - 1);
        root.right = helper(preorder, index + 1, end);

        return root;
    }
}