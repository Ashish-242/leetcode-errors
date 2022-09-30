class Solution {
    public boolean stoneGame(int[] piles) {
        int tsum=0;
        for(int val:piles) tsum+=val;
        int n=piles.length;
        int[][]dp=new int[n][n];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
   int  ans=solve(piles,0,n-1,dp);
        if(tsum/2 < ans) return true;
        return false;
    }
    public int solve(int[] arr,int si,int ei,int[][] dp){
        
        if(si>ei) return 0;
        if(dp[si][ei]!=-1) return dp[si][ei];
        int first=arr[si] + solve(arr,si+1,ei-1,dp);
        int second=arr[ei]+ solve(arr,si+1,ei-1,dp);
        int mx=Math.max(first,second);
        return dp[si][ei]=mx;
    }
}