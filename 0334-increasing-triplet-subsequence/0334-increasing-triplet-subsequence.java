class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        int[] ans=new int[nums.length];
        
        ans[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            ans[i]=Math.min(ans[i-1],nums[i]);
        }
        int right=nums[n-1];
        for(int i=n-2;i>=0;i--){
               if(ans[i] <nums[i] && nums[i]<right) return true;
            right=Math.max(right,nums[i]);
        }
 
        return false;
    }
}