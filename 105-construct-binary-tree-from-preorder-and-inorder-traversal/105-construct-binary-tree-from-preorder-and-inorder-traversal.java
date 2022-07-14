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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==1) return new TreeNode(-1);
      TreeNode ans=  solve(preorder,0,preorder.length-1,0,preorder.length-1,inorder);
        return ans;
    }
    public TreeNode solve(int[] pre,int pi,int pe,int ii,int ie,int[] in){
        if(pi>pe) return null;
        int idx=ii;
        while(pre[pi]!=in[idx]){
            idx++;
        }
        int c=idx-ii;
        TreeNode root=new TreeNode(pre[pi]);
        root.left=solve(pre,pi+1,pi+c,ii,idx-1,in);
        root.right=solve(pre,pi+c+1,pe,idx+1,ie,in);
        return root;
        
    }
}