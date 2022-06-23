class Solution {
    public int findMiddleIndex(int[] nums) {
             if(nums.length==1) return 0;
        int sumright=0,sumleft=0;
        for(int i=0;i<nums.length;i++) {
            sumright+=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            sumright-=nums[j];
            if(j==0  && sumleft!=sumright){
                sumleft+=nums[j];
            }else if(sumleft!=sumright){
                sumleft+=nums[j];
               
            }else {
                return j;
            }
        }
        return -1;
    }
}