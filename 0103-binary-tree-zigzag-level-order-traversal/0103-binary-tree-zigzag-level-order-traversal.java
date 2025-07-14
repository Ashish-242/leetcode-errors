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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return new ArrayList<>();
        q.add(root);
        int level=1,index=0;
        while(!q.isEmpty()){
            int s=q.size();
            int ss=s;
            List<Integer> l=new ArrayList<>();
            index=0;
            while(s-->0){
                TreeNode n=q.remove();
                if(level%2==0){
                l.add(index,n.val);
                    
                }else{
                    l.add(index++,n.val);
                }
                
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
            }
            if(l.size()>0) list.add(new ArrayList<Integer>(l));
          
            level++;
        }
        return list;
    }
}