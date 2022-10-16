class Solution {
    public int numSubarrayBoundedMax(int[] nums, int l, int r) {
//         two pointers approach
//         sliding window 
        int i=0;
        int j=0;
        int n=nums.length;
        int count=0;
        int ans=0;
        while(j<n){
            
            if(nums[j]>=l && nums[j]<=r){
                count=j-i+1;
                ans+=count;
            }
//            if element is smaller than left
            else if(nums[j]<l){
                ans+=count;
            }
//             when the element is large
            else{
                count=0;
                i=j+1;
            }
            j++;
        }
        return ans;
        
    }
}