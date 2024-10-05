class Solution {
    public int findPeakElement(int[] nums) {
        
        int lo=0,n=nums.length,hi=n-1;
        if(n==1) return 0;
        int mid=0;
        while(lo<=hi){
         mid=(lo+(hi-lo)/2);
        
            if(mid==0 && nums[mid+1] <nums[mid]) return mid;
            else if(mid==n-1 && nums[mid-1] < nums[mid]) return mid;
        
            if(nums[mid] < nums[mid+1]){
                lo=mid+1;
            }else if(nums[mid] < nums[mid-1]){
                hi=mid-1;
            }else return mid;
        }
        return mid;
    }
}