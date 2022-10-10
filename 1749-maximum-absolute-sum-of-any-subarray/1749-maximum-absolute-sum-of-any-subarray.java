class Solution {
    public int maxAbsoluteSum(int[] nums) {
    
        int n=nums.length;
        int[] nans=new int[nums.length];
        for(int i=0;i<n;i++){
            nans[i]=-nums[i];
        }
        return Math.max(kadanes(nums),kadanes(nans));
    
    }
    public int kadanes(int[] arr){
        // kadanes algo 
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            
            maxsum=Math.max(maxsum,sum);
            if(sum<0) sum=0;
        }
        return maxsum;  
    }
}