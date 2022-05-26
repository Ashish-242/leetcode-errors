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
    public void callfovalue(TreeNode root){
         if(root==null) return;
     
        
        count+=1;
        callfovalue(root.left);
        callfovalue(root.right);
    }
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
           if(root.left==null && root.right==null)  return count+=1;
        callfovalue(root);
        return count;
    }

}