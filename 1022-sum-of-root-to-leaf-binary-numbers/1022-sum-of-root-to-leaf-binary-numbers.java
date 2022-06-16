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
    public int sumRootToLeaf(TreeNode root) {
   
        solve(root,0);
      
        return sum;
    }
    public void solve(TreeNode root,int val){
        if(root== null){
          
            return;
        } 
        
       val=val<<1 |root.val;
        if(root.left==null && root.right==null){
           sum+=val;
        
        }
        solve(root.left,val);
        solve(root.right,val);
           
    }
}