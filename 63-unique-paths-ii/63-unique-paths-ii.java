class Solution {
    public int uniquePathsWithObstacles(int[][] obs) {
         int m=obs.length;
        int n=obs[0].length;
        int[][] dp=new int[m+1][n+1];
        for(int[] ar:dp){
            Arrays.fill(ar,0);
        }
        if(obs[m-1][n-1]==1) return 0;
        int x=mem(0,0,m,n,dp,obs);
        
        return x;
    }
    public int mem(int x,int y,int m,int n, int[][] dp,int[][] obs){
        if(x>=m || y>=n) return 0;
        if(x==m-1 && y==n-1) return 1;
        if(obs[x][y]==1){
            return dp[x][y]=0;
        }
        if(dp[x][y]!=0) return dp[x][y];
        return dp[x][y]=mem(x+1,y,m,n,dp,obs)+mem(x,y+1,m,n,dp,obs);
    }
}