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
    public List<Integer> largestValues(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        while(q.size()>0){
            int s=q.size();
            int mx=Integer.MIN_VALUE;
            while(s-->0){
                TreeNode r=q.remove();
                mx=Math.max(mx,r.val);
                if(r.left!=null){
                    q.add(r.left);
                    
                }
                if(r.right!=null){
                    q.add(r.right);
                }
            }
            res.add(mx);
        }
        return res;
    }
}