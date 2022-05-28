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
    public TreeNode construct(int[] nums,int s,int e){
        if(s>e) return null;
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=s;i<=e;i++){
            if(nums[i]> max) index=i;
            max=Math.max(nums[i],max);
        }
        TreeNode node=new TreeNode(max);
        node.left=construct(nums,s,index-1);
        node.right=construct(nums,index+1,e);
        return node;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int n=nums.length;
        TreeNode root = construct(nums,0,n-1);
        return root;
    }
}