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
    List<List<Integer>> res=new ArrayList<>();
    public void solve(TreeNode root,int tar, List<Integer> temp,int sum){
        if(root==null) return;  
        else if((sum+ root.val)== tar && (root.left==null) && root.right==null){
              temp.add(root.val);
        res.add(new ArrayList<>(temp));
              temp.remove(temp.size()-1);
            // System.out.print(res);  
            return;
        }
       
      
      
//         lets do preorder here
        temp.add(root.val);
     
      
         solve(root.left,tar,temp,sum+root.val);
         solve(root.right,tar,temp,sum+root.val);
        
        temp.remove(temp.size()-1);
        
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        solve(root,targetSum,new ArrayList<>(),0);
        return res;
    }
}