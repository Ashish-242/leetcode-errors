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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        TreeNode rootnode=find(root,key);
         return rootnode;
    }
    public TreeNode find(TreeNode root,int key){
       
        if(root==null) return null;
         
     
         if(root.val<key){
            if(root.right!=null){
             root.right= find(root.right,key);
                return root;
            }
        }else if(root.val>key){
             if(root.left!=null){
                root.left= find(root.left,key);
                return root;
             }
           
        }else{
            if(root.left==null && root.right==null) return null;
        else if(root.left!=null && root.right==null ) return root.left;
         else if(root.left==null && root.right!=null ) return root.right;
         else{
            int nextsmallest=findnextsmallest(root.right);
           root.val=nextsmallest;
          root.right=find(root.right,nextsmallest);
            return root;
          
         }
        
        }
       
       return root;
    }
    public int findnextsmallest(TreeNode root){
      while(root.left!=null){
        root=root.left;
      }
      return root.val;
    }
}