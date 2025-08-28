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
    boolean nodeisfound=false;
    public TreeNode deleteNode(TreeNode root, int key) {
         return solve(root,root,key);
        
    }
    public TreeNode solve(TreeNode root,TreeNode node,int key){
        if(node==null) return null;
        if(key>node.val)
        node.right=solve(root,node.right,key);
        else if(key<node.val){
           node.left= solve(root,node.left,key);
        }else{
            //node is found
          
            //now there are 3 condition
            //it is only node
            if(node.left==null && node.right==null)
            return null;
            //it has both child
            else if(node.left!=null && node.right!=null){
                addnextnode(node.right,node.left);
               
                node=new TreeNode(node.right.val,node.right.left,node.right.right);
            }
            //it has one child
            else if(node.left!=null){
                node=node.left;
               
            }else{
                node=node.right;
                
            }
            return node;
        }
        return node;
    }
    public void addnextnode(TreeNode node,TreeNode leftnode){
        
        if(node.left==null ){
            node.left=new TreeNode(leftnode.val,leftnode.left,leftnode.right);
            return;
        }
        addnextnode(node.left,leftnode);
    }
}