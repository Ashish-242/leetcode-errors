class Solution {
    public int findPeakElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(nums.length>1) {
                    if(nums[i+1] < nums[i]) return i;
                }
                else return i;
            }else if(i==nums.length-1){
                if(nums.length>1) {
                    if(nums[i-1] < nums[i]) return i;
                }
               
            }else{
                if(nums[i-1] <nums[i] && nums[i]> nums[i+1]) return i;
            }
        }
        return -1;
    }
}