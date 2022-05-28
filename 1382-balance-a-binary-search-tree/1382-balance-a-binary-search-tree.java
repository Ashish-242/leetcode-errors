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
    public void inorder(TreeNode node,ArrayList<Integer> list){
        if(node==null) return;
        
       
        inorder(node.left,list);
         list.add(node.val);
        inorder(node.right,list);
    }
    public TreeNode tree(ArrayList<Integer> list,int s,int e){
        if(s>e) return null;
        // if(s==e) return null;
        int mid =(e+s)/2;
        TreeNode x=new TreeNode(list.get(mid));
        x.left=tree(list,s,mid-1);
        x.right=tree(list,mid+1,e);
        return x;
    }
    public TreeNode balanceBST(TreeNode root) {
//         Inorder traversal
        ArrayList<Integer> list=new ArrayList<>();
        inorder(root,list);
        int n=list.size();
        TreeNode temp=tree(list,0,n-1);
        return temp;
     
    }
}