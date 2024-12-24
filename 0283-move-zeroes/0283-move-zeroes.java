class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=1;       
        while(j<nums.length){
            if((i<nums.length && nums[i]!=0) && nums[j]!=0){
                i++;
                j++;
            }
            else if(nums[i]!=0 && i<nums.length-1){
                i++;
            }
        else if(nums[j]==0) j++;
          else {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;j++;
          }
        }
    }
}