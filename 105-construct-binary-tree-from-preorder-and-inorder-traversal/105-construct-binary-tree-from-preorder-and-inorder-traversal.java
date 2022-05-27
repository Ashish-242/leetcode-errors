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
    public  TreeNode search(int[] preorder,int pi,int pe,int ii,int ie,int[] inorder){
    if(ii> ie) return null;
    int idx=ii;
    while(inorder[idx]!=preorder[pi]) idx++;
    int c=idx-ii;
    TreeNode node=new TreeNode(preorder[pi]);


    node.left=search(preorder,pi+1,pi+c,ii,idx-1,inorder);
        node.right=search(preorder,pi+c+1,pe,idx+1,ie,inorder);
  return node;
}
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
      return search(preorder,0,n-1,0,n-1,inorder);
    }
}