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
    
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        travel(root,root.val,targetSum,map);
        return count;
    }
    public void travel(TreeNode node,int sum,int tar,  HashMap<Integer,Integer>map){
        if(map.containsKey(sum-tar)) count+=map.get(sum-tar);
        if(map.containsKey(sum)) map.put(sum,map.getOrDefault(sum,0)+1);
        else map.put(sum,1);
        
//         calls
        if(node.left!=null)  travel(node.left,sum+node.left.val,tar,map);
            
      
     
        if(node.right!=null) travel(node.right,sum+node.right.val,tar,map);
        
//         removal
        if(map.get(sum)==1) map.remove(sum);
        else map.put(sum,map.get(sum)-1);
        
    }
}