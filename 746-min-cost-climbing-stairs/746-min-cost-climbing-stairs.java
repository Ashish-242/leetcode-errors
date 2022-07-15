class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int N=cost.length;
        int[] dp=new int[N+1];
        Arrays.fill(dp,-1);
        int x=fib(cost,dp,N);
        return x;
    }
    public int fib(int[] cost,int[] dp,int N){
        if(N<=1){
            return dp[N]=cost[N];
        }
        if(dp[N]!=-1){
            return dp[N];
        }
        
        return dp[N]=Math.min(fib(cost,dp,N-1),fib(cost,dp,N-2))+ (N==dp.length-1?0:cost[N]);
    }
}