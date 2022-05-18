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
    public int findBottomLeftValue(TreeNode root) {
                ArrayList<Integer> ans = new ArrayList<Integer>();
        // LinkedList<TreeNode> qt=new LinkedList<>();
        Queue<TreeNode> qt=new LinkedList<>();

        qt.add(root);
       
        while(qt.size()!=0){

            ans.add(qt.peek().val);
            int size=qt.size();
             while ( size-->0 ) {
            
            TreeNode res=qt.remove();
            if(res.left!=null) qt.add(res.left);
             if(res.right!=null) qt.add(res.right);
        }
        }
       int x=0;
        for(int i=0;i<ans.size();i++){
            if(i==ans.size()-1){
                x=ans.get(i);
            }
        }
        return x;
    }
}