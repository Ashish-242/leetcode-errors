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
    public  TreeNode search(int[] postorder,int pi,int pe,int ii,int ie,int[] inorder){
    if(ii> ie) return null;
    int idx=ii;
    while(inorder[idx]!=postorder[pe]) idx++;
    int c=idx-ii;
    TreeNode node=new TreeNode(postorder[pe]);
// for left in post=pi,pi+count-1
// for right in post=pi+count,pi-1
// for left in inorder=ii,idx-1
// for right in inorder=id+1,ie

    node.left=search(postorder,pi,pi+c-1,ii,idx-1,inorder);
        node.right=search(postorder,pi+c,pe-1,idx+1,ie,inorder);
  return node;
}
    public TreeNode buildTree(int[] inorder, int[] postorder) {
          
      int n=inorder.length;
      return search(postorder,0,n-1,0,n-1,inorder);
    }
}