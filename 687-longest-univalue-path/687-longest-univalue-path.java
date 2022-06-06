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
    int len=0;
    public int longestUnivaluePath(TreeNode root) {
        
       int ans= solve(root,-1);
        if(len >0) len=len-1;
        return len;
        
    }
    public int solve(TreeNode node,int value){
        if(node==null) return 0;
        int left=solve(node.left,node.val);
        int right=solve(node.right,node.val);
        
        if(left+right+1 > len){
            len=left+right+1;
        }
        if(value==node.val){
            return Math.max(left,right)+1;
        }else{
            return 0;
        }
        
    }
}