class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] ar:dp){
            Arrays.fill(ar,-1);
            
        }
        int ans=solve(n-1,amount,coins,dp);
        if(ans==1000000) return -1;
        return ans;
    }
    public int solve(int n,int target,int[] arr,int[][] dp){
        if(n==0){
            if(target%arr[n]==0){
                return dp[n][target]=target/arr[n];
            }else return 1000000;
        }
        
        if(dp[n][target]!=-1) return dp[n][target];
        int nottake=solve(n-1,target,arr,dp);
        int take=Integer.MAX_VALUE;
        if(arr[n]<=target){
            take=1+solve(n,target-arr[n],arr,dp);
        }
        return dp[n][target]=Math.min(take,nottake);
    }
}