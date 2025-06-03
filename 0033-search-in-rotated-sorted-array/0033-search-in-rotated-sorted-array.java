class Solution {
    public int search(int[] nums, int target) {
        int mid=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                mid=i;
                break;
            }
        }

        int a=solve(nums,0,mid-1,target);
        int b=solve(nums,mid,nums.length-1,target);
        if(a>-1) return a;
        if(b>-1) return b;
        return -1;
    }

    public int solve(int[] nums,int lo,int hi,int target){
        if(lo > hi) return -1;
        int mid=lo+(hi-lo)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid] >target){
            return solve(nums,lo,mid-1,target);
        }else{
            return solve(nums,mid+1,hi,target);
        }
    }
}