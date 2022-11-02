class Solution {
Random r;
    HashMap<Integer,List<Integer>> map;
    
    public Solution(int[] nums) {
        map=new HashMap<>();
        r=new Random();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
            
            
        }
    }
    
    public int pick(int target) {
        if(!map.containsKey(target)){
            return -1;
        }
       
            List<Integer> curr=map.get(target);
            return curr.get(r.nextInt(curr.size()));
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */