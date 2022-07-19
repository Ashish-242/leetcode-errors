class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int totalsum=0;
        for(int it:nums) totalsum+=it;
        if(totalsum%2!=0) return false;
        int target=totalsum/2;
        
       int[][]dp=new int[n][target+1];
            for(int[] ar:dp){
                Arrays.fill(ar,-1);
            }
        int ans=mem(n-1,target,nums,dp);
        if(ans==1) return true;
        else return false;
    }
    public  int mem(int n,int tar,int arr[],int[][] dp){
            if(tar==0) return 1;
            if(n==0) {
                if(arr[0]==tar) return 1;
                else return 0;

            }
            if(dp[n][tar]!=-1) return dp[n][tar];
            int nottake=mem(n-1,tar,arr,dp);
            int take=0;
            if(arr[n]<=tar){
                 take=mem(n-1,tar-arr[n],arr,dp);
            }
                if((take==1 && nottake==0) || (take==0 && nottake==1)){
                    dp[n][tar]=1;
                }else if(take==1 && nottake==1) dp[n][tar]=1;
                else dp[n][tar]=0;
            return  dp[n][tar];
    }
}