// Last updated: 21/07/2026, 23:11:31
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

    TreeNode *prevOrderTraversal(vector<int>&arr,int &index,int lower,int upper){

        if(index==arr.size() || lower>arr[index] || upper<arr[index]){
            return NULL;
        }
        TreeNode *root=new TreeNode(arr[index++]);
        root->left=prevOrderTraversal(arr,index,lower,root->val);
        root->right=prevOrderTraversal(arr,index,root->val,upper);
        return root;
        
    }

    TreeNode* bstFromPreorder(vector<int>& preorder) {
        int index=0;
        return prevOrderTraversal(preorder,index,INT_MIN,INT_MAX);
    }
};