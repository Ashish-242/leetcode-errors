class Solution {
    public int minSteps(int n) {
        if(n==1) return 0;
        int[][] dp=new int[n+1][n+1];
        for(int[] d:dp) Arrays.fill(d,-1);
        int ans=solve(1,1,1,n,dp);
        return ans;
        
    }
    public int solve(int step,int value,int copy,int n,int[][] dp){
//         there are two steps paste copy value
//         copy it and then paste it
        if(step > n || value>n) return Integer.MAX_VALUE;
        if(value==n) return step;
        if(dp[step][value]!=-1) return dp[step][value];
        
        int minstep=Math.min(solve(step+1,value+copy,copy,n,dp),solve(step+2,value*2,value,n,dp));
         return dp[step][value]=minstep;
        
        
    }
}


