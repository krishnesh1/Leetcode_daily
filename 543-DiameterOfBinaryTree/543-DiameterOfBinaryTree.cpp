// Last updated: 21/07/2026, 23:12:20
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
  
    int diameterOfBinaryTree(TreeNode* root) {
        int maxi=0;
        findheight(root,maxi);
        return maxi;
    }
      int findheight(TreeNode *root,int &maxi){
        if(root==NULL) return 0;
        int ln = findheight(root->left,maxi);
        int rh = findheight(root->right,maxi);
        maxi=max(maxi,ln+rh);
        return 1+max(ln,rh);
    }
};