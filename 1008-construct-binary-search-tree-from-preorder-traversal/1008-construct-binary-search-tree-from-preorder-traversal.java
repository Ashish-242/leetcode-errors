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
    // int maxx=Integer.MAX_VALUE;
    int index=0;
    public TreeNode preorder(int[] pre,int min,int max){
     if(index==pre.length) return null;
     else if(min<pre[index] && pre[index]<max){
          TreeNode root=new TreeNode(pre[index]);
         // ii++;
         index++;
        root.left=preorder(pre,min,root.val);
        // maxx=max;
        root.right=preorder(pre,root.val,max);
        return root;
    }
        else {
        return null;
        }
      
        
        
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode x=preorder(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
        return x;
    }
}