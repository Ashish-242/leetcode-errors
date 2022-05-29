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
     ArrayList<Integer> ans=new ArrayList<>();
    public void call(TreeNode node,ArrayList<Integer> list){
        if(node==null)return;
        
        
        call(node.left,list);
        list.add(node.val);
        call(node.right,list);
    }
    public void solve(ArrayList<Integer> list1,ArrayList<Integer> list2){
        int i=0;
        int j=0;
       
        while(i!=list1.size() && j!=list2.size()){
            if(list1.get(i)> list2.get(j)){
                 ans.add(list2.get(j));
            j++;
            }else if(list1.get(i) < list2.get(j)){
                ans.add(list1.get(i));
                i++;
            }else{
                ans.add(list1.get(i));
                ans.add(list2.get(j));
                i++;
                j++;
            }
           
        }
        while(i!=list1.size()){
            ans.add(list1.get(i));
            i++;
        }
        while(j!=list2.size()){
            ans.add(list2.get(j));
            j++;
        }
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1=new ArrayList<>();
          ArrayList<Integer> list2=new ArrayList<>();
        call(root1,list1);
        call(root2,list2);
         solve(list1,list2);
        return ans;
        
        
    }
}