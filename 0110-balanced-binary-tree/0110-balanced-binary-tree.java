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
    public boolean isBalanced(TreeNode root) {
        int result=solve(root);
        return result==-1?false:true;
    }
       public int solve(TreeNode root){
        if(root==null) return 0;
        int left=0,right=0;
        if(root.left!=null) left=solve(root.left);
        if(root.right!=null) right=solve(root.right);
        if(left == -1 || right == -1) return -1;
        int balanced=Math.abs(right-left);
        if(balanced>1) return -1;
        return Math.max(left,right)+1;
    }
}