class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m+1][n+1];
        for(int[] ar:dp){
            Arrays.fill(ar,0);
        }
        int x=mem(0,0,m,n,dp);
        return x;
    }
    public int mem(int x,int y,int m,int n, int[][] dp){
        if(x>=m || y>=n) return 0;
        if(x==m-1 && y==n-1) return 1;
        if(dp[x][y]!=0) return dp[x][y];
        return dp[x][y]=mem(x+1,y,m,n,dp)+mem(x,y+1,m,n,dp);
    }
}