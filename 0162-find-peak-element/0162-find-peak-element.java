class Solution {
    public int findPeakElement(int[] nums) {
        
        int n=nums.length;
       return helper(nums,0,n-1);
        
    } 
    public int helper(int[] nums,int lo,int hi){
        if(lo==hi) return lo;
        if(lo+1==hi){
            if(nums[lo]>nums[hi]){
                return lo;
            }else return hi;
        }
        int ans=0;
        while(lo<=hi){
           
             if(lo+1==hi){
            if(nums[lo]>nums[hi]){
                return lo;
            }else return hi;
        }
            if(lo==hi) return lo;
            
           int mid=(lo+hi)/2;
            if(nums[mid-1]< nums[mid] && nums[mid]>nums[mid+1]){
             return mid;
               
            }else if(nums[mid-1]> nums[mid] && nums[mid] >nums[mid+1]){
             hi=mid-1;
            }else{
            lo=mid+1;
            }
        }
        return ans;
    }
}
