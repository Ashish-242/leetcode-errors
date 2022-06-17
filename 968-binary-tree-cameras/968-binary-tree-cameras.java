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
    int count=0;
     int c=1;
    int m=2;
     int nm=3;
    public int solve(TreeNode node){
        if(node==null) return m;
        int left=solve(node.left);
        int right=solve(node.right);
        if(left==nm ||right==nm){
            count+=1;
            return c;
        }else if(left==m && right==m){
            return nm;
        }else {
            return m;
        }
    }
    public int minCameraCover(TreeNode root) {
        
        int ans=solve(root);
        if(ans==nm){
            count+=1;
        }
        return count;
    }
}