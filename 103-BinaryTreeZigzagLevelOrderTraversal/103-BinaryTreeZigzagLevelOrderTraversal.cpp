// Last updated: 21/07/2026, 23:14:31
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
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
      vector<vector<int>>result;
      if(root==NULL){ return result;}
      queue<TreeNode *>q;
      q.push(root);
      int flag=true;
      while(!q.empty()){
        int size = q.size();
        vector<int>v(size);
        for(int i=0;i<size;i++){
            TreeNode *temp=q.front();
            q.pop();
            int index = (flag) ? i:(size-1-i);
            v[index]=temp->val;
            if(temp->left){
                q.push(temp->left);
            }
            if(temp->right){
                q.push(temp->right);
            }
        }
        flag=!flag;
        result.push_back(v);
      }
      return result;
    }
};