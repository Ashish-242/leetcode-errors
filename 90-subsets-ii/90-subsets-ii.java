class Solution {
    List<List<Integer>> res=new ArrayList<>();
    HashSet<List<Integer>> set=new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
         ArrayList<Integer> list=new ArrayList<>();
        if(nums.length==0 || nums==null) return res;
        solve(0,nums,list);
        return res;
    }
    public void solve(int i,int[] nums,ArrayList<Integer>list){
//         base case
        if(i>=nums.length){
            if(!set.contains(list)){
                set.add(list);
                res.add(new ArrayList<>(list));
            }
            
            return;
        }
//         pick
        list.add(nums[i]);
        solve(i+1,nums,list);
        list.remove(list.size()-1);
        
//         not pick
        solve(i+1,nums,list);
        
    }
}
