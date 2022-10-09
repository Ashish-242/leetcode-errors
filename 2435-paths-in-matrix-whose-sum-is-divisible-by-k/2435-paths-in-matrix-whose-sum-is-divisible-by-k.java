class Solution {
  int mod=(int) 1e9+7;
     public int solve(int n,int m,int N,int M,int[][] grid,int k,int sum,int[][][] dp){
        if(n>=N || m>=M ) return 0;
         sum+=grid[n][m];
        if(n==N-1 && m== M-1){ 
          
           return sum%k==0?1:0;
        }
        if(dp[n][m][sum%k]!=-1) return dp[n][m][sum%k];
        int call1=solve(n+1,m,N,M,grid,k,sum,dp)%mod;
        int call2=solve(n,m+1,N,M,grid,k,sum,dp)%mod;
     
        return dp[n][m][sum%k]=(call1+call2)%mod;
    }
    public int numberOfPaths(int[][] grid, int k) {
       
        int n=grid.length;
        int m=grid[0].length;
         int[][][]dp=new int[n+1][m+1][50];
        for(int[][] dd:dp){
            for(int[]d:dd)  Arrays.fill(d,-1);
           
        }
 return solve(0,0,n,m,grid,k,0,dp);
      
    }
}