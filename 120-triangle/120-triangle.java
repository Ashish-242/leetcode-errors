class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int m=n;
        
       int[][] dp=new int[n][n];
        for(int[] arr:dp){
               Arrays.fill(arr,-1);
        }
      int x=mem(0,0,n,n,dp,triangle);
        return x;
    }
    public int mem(int i,int j,int n,int m,int[][] dp,List<List<Integer>> Triangle){
        
        if(i>=n || j>=n) return 0;
        if(i==n-1 && j<m) return dp[i][j]=Triangle.get(i).get(j);
        if(dp[i][j]!=-1) return dp[i][j];
        int path=Triangle.get(i).get(j);
        path+=Math.min(mem(i+1,j,n,m,dp,Triangle),(mem(i+1,j+1,n,m,dp,Triangle)));
      dp[i][j]=path;
        return dp[i][j];
    }
    
}