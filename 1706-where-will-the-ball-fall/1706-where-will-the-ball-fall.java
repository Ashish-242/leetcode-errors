class Solution {
    public int[] findBall(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] dp=new int[101][101];
        for(int []d:dp){
            Arrays.fill(d,-2);
        }
        int[] ans=new int[m];
        for(int i=0;i<m;i++){
            ans[i]=solve(grid,0,i,n,m,dp);
        }
        return ans;
    }
    public boolean isvalid(int r,int c,int n,int m){
        if(r>=0 && r<n && c>=0 && c<m){
            return true;
        }
        return false;
    }
    public int solve(int[][] grid,int r,int c,int n,int m,int[][] dp){
        if(r==n) return c;
        if(isvalid(r,c,n,m)){
             if(grid[r][c]==1 && (isvalid(r,c+1,n,m) &&  grid[r][c+1]==1)){
            if(dp[r][c]!=-2) return dp[r][c];
           return dp[r][c]=solve(grid,r+1,c+1,n,m,dp);
            
        }
           if(grid[r][c]==-1 && (isvalid(r,c-1,n,m) && grid[r][c-1]==-1)){
            if(dp[r][c]!=-2) return dp[r][c];
           return dp[r][c]=solve(grid,r+1,c-1,n,m,dp);
            
        }
        }
        return -1;
       
       
        
    }
}