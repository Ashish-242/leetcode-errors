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
    public int min(TreeNode node){
//         if we are considering for right subtree
        while(node.left!=null){
            node=node.left;
        }

        return node.val;
        
    }
    public TreeNode solve(TreeNode node,int k){
        if(node==null){
            return null;
        }
        if(k>node.val){
             node.right=solve(node.right,k);
           return node;
        }else if(k<node.val){
        node.left=solve(node.left,k);
         return node;
        }else{
            
            if(node.left!=null && node.right!=null){
//                 for right subtree
                int rmin=min(node.right);
                node.val=rmin;
               
                node.right=solve(node.right,rmin);
                return node;
          
              
            }else if(node.right!=null){
              
                 return node.right;
              
            }else if(node.left!=null ){
                 return node.left;
               
            }
            else{
                
                return null;
            
            }
        }  
        
        }
    
    
    public TreeNode deleteNode(TreeNode root, int key) {
        
       TreeNode x= solve(root,key);
        return x;
        
    }
}