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
    int sum=0;
    int m=Integer.MIN_VALUE;
    public  void solve(TreeNode node){
        if(node==null) return ;
        
        solve(node.right);
          node.val+=sum;
           sum=node.val;
       
        solve(node.left);
       
        
    }
    public TreeNode convertBST(TreeNode root) {
        solve(root);
        return root;
    }
}