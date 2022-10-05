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
    public void solve(TreeNode root,int h,int val,int depth){
        if(root==null) return;
        if(h==depth-1){
            TreeNode curr=new TreeNode(val);
           if(root.left!=null){
           
               curr.left=root.left;
               root.left=curr;
        }else root.left=curr; 
            TreeNode curr2=new TreeNode(val);
            if(root.right!=null){
               
                curr2.right=root.right;
                root.right=curr2;
            }else root.right=curr2;
            return;
        }
        solve(root.left,h+1,val,depth);
        solve(root.right,h+1,val,depth);
       
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode cur=new TreeNode(val);
            cur.left=root;
            return cur;
        }
     solve(root,1,val,depth);
        return root;
    }
}