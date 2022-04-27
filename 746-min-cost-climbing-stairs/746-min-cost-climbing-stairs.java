class Solution {
    public int min(int[] cost,int n,int[] dp){
        if(n<=1){
           return  dp[n]=cost[n];
            
        }
        if(dp[n]!=0) return dp[n];
        int a=min(cost,n-1,dp);/*two calls wre made for n-1 and n-2*/
           int b=min(cost,n-2,dp);
//         we calculate minimum of both of calls and add theri corresponding value from cost array
       return dp[n] =Math.min(a,b) + (n==cost.length?0:cost[n]);
       
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp =new int[cost.length+1];
        int x=min(cost,cost.length,dp);
        return x;
    }
}