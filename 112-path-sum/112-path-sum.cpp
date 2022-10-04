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
  
    bool hasPathSum(TreeNode* root, int Sum) {
        
      if(root == NULL) return false;

        if(root->left == NULL and root->right == NULL){
        if(Sum-root->val == 0) return true;
            
            return false;
        }
  
        bool xl=hasPathSum(root->left,Sum-root->val);
        
        bool yr = hasPathSum(root->right,Sum-root->val);
        if(xl|| yr) return true;
        else return false;
        
        
    }
};