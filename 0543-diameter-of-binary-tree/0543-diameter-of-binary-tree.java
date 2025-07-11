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
    int max=Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        int ans=solve(root);
        return max;
    }
     int solve(TreeNode root){
        if(root==null) return 0;
       
        int left=solve(root.left);
        int right=solve(root.right);
        int val=left+right;
        if(val>max) max=val;
        return Math.max(left,right)+1;
    }
}