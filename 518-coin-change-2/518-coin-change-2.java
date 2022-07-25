class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] ar:dp){
            Arrays.fill(ar,-1);
            
        }
        int ans=solve(n-1,amount,coins,dp);
     
        return ans;
    }
     public int solve(int n,int target,int[] arr,int[][] dp){
        if(n==0){
            if(target%arr[n]==0){
                return dp[n][target]=1;
            }else return 0;
        }
        
        if(dp[n][target]!=-1) return dp[n][target];
        int nottake=solve(n-1,target,arr,dp);
        int take=0;
        if(arr[n]<=target){
            take=solve(n,target-arr[n],arr,dp);
        }
        return dp[n][target]=take+nottake;
    }
}