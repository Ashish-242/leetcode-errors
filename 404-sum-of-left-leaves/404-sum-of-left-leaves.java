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
    public void sumofleft(TreeNode root,boolean flag){
      if(root == null)return ;
        if(root.left == null && root.right == null && flag == true)sum+=root.val;
        sumofleft(root.left,true);
        sumofleft(root.right,false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        
        sumofleft(root,false);
        return sum;
    }
}