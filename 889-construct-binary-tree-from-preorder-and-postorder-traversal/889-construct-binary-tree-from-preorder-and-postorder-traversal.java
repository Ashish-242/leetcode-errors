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
//     ip=pre first index
//     ep=pre last index
//     ips=post first index
//     eps=post end index
    
    public TreeNode solve(int[] pre,int[] post,int ip,int ep,int ips,int eps,  HashMap<Integer,Integer> map){
        if(ip>ep || ips>eps) return null;
          TreeNode root=new TreeNode(pre[ip]);
       
        if(ip+1<=ep){
        int idx=map.get(pre[ip+1]);
        int  lcs=idx-ips+1;
       
        root.left=solve(pre,post,ip+1,ip+lcs,ips,idx,map);
        root.right=solve(pre,post,ip+lcs+1,ep,idx+1,eps-1,map);
             }
        return root;
        
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
         HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        for(int it: postorder){
            map.put(it,i);
            i++;
        }
        return solve(preorder,postorder,0,preorder.length-1,0,postorder.length-1,map);
    }
}