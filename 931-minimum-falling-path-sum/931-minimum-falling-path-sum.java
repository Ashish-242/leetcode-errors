class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int[][] dp=new int[n][n];
        if(matrix[0].length==1) return matrix[0][0];
        int minimum=Integer.MAX_VALUE;
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        for(int j=0;j<n;j++){
            minimum=Math.min(minimum,mem(0,j,n,matrix,dp));
        }
        return minimum;
    }
    public int mem(int i,int j ,int n,int[][] mat,int[][] dp){
        if( j<0 || j>=n) return Integer.MAX_VALUE;
        if(i==n-1) return dp[i][j]=mat[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
        
        int a=mem(i+1,j-1,n,mat,dp);
        int b=mem(i+1,j,n,mat,dp);
        int c=mem(i+1,j+1,n,mat,dp);
        int ans=Math.min(Math.min(a,b),c)+mat[i][j];
        return dp[i][j]=ans;
    }
}