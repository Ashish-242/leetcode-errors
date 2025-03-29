class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int val=0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])) set.add(nums[i]);
            else {
                val=nums[i];
                break;
            }
        }
        return val;
    }
}