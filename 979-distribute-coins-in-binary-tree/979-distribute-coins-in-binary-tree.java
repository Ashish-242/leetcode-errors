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
    int count=0;
    class Pair{
        int nodes;
        int coins;
        Pair(int nodes,int coins){
            this.nodes=nodes;
            this.coins=coins;
        }
    }
    public Pair solve(TreeNode node){
        if(node==null) return new Pair(0,0);
        Pair x=solve(node.left);
        Pair y=solve(node.right);
        Pair ans=new Pair(x.nodes+y.nodes+1,x.coins+y.coins+node.val);
        count+=Math.abs(ans.nodes-ans.coins);
        return ans;
    }
    public int distributeCoins(TreeNode root) {
        solve(root);
        return count;
    }
}