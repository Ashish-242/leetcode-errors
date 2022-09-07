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
    StringBuilder sb=new StringBuilder();
  
    public void solve(TreeNode root){
        if(root==null) {
            // sb.append(')');
            return ;
        }
        if(root!=null) sb.append(root.val);
        if(root.left== null && root.right==null){
          
            return;
        }
        if(root.right!=null || root.left!=null){
            sb.append('(');
            solve(root.left);
           sb.append(')');
                if(root.right!=null){
                    sb.append('(');
             solve(root.right);
                    sb.append(')');
                    
                }
            
            
        }
        // return root;
    }
    public String tree2str(TreeNode root) {
        if(root==null) return "";
        sb=new StringBuilder();
         solve(root);
        return sb.toString();
    }
}