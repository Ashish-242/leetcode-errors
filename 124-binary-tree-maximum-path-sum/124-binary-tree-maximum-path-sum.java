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
    
 int m=Integer.MIN_VALUE;
    
    public  int solve(TreeNode root,int sum){
        if(root==null){
        return 0;
        }
//         if(sum+root.val >m){
//             m=sum+root.val;
           
//         }
        // if(sum+root.val>0) sum+=root.val;
        int left=solve(root.left,sum);
        int right=solve(root.right,sum);
        
        int left_dash=Math.max(left,0);
        int right_dash=Math.max(right,0);
                                
        int total=right_dash+left_dash+root.val;
        if(total > m) m=total;
        return  Math.max(left_dash,right_dash) + root.val;
       
    }
   
    public int maxPathSum(TreeNode root) {
        m=Integer.MIN_VALUE;
        if(root==null) return 0;
        if(root.right==null && root.left==null) return root.val;
         int x= solve(root,0);
        return m;
   
    }
}