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
    public int height(TreeNode root){
        if(root==null) return 0;
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
        
    }
    
    public void sumofleaves(TreeNode root,int k,int h){
        if(k>h || root==null) return;
        if(k==h) sum+=root.val;
       
        sumofleaves(root.left,k+1,h);
        sumofleaves(root.right,k+1,h);
        
    }
    public int deepestLeavesSum(TreeNode root) {
        int h=height(root);
        sumofleaves(root,1,h);
        return sum;
        
    }
}