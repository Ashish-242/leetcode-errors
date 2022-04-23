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
    boolean flag=true;
    public int balance(TreeNode root){
        if(root==null) return 0;
     
        int l=balance(root.left);
        int r=balance(root.right);
           if(Math.abs(l-r) >1 ){
                    flag=false;
              
           }
          
        return Math.max(l,r)+1;
        
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
       
      balance(root);
        if(flag==false) return false;
        else return true;
    }
}