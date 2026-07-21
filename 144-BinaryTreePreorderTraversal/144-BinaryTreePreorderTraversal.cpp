// Last updated: 21/07/2026, 23:13:49
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



     void preorder(TreeNode* root,vector<int>&result){
        if(root==NULL) return ;
        result.push_back(root->val);
        preorder(root->left,result);
        preorder(root->right,result);
    }
    vector<int> preorderTraversal(TreeNode* root) {
        vector<int> result;
        preorder(root,result);
        return result;
    }
};