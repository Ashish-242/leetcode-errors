class Solution {
    int mod=(int)1e9+7;
    int M=51;
    int[]dx ={1,-1,0,0};
    int[] dy={0,0,1,-1};
    // int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public int solve(int m,int n,int mm,int sr,int sc,int[][] arr,int[][][] dp){
     
        if(sr>=m || sc>=n || sr<0 || sc<0) return  1;
        
        else if(mm<=0) return 0;
     if(dp[sr][sc][mm]!=-1) return dp[sr][sc][mm];
        int count=0;
        for(int i=0;i<dx.length;i++){
            int x=sr+dx[i];
            int y=sc+dy[i];
            
            count+=solve(m,n,mm-1,x,y,arr,dp);
            count=count%mod;
        }
        count=count%mod;
        return dp[sr][sc][mm]=count;
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][] arr=new int[m][n];
        int[][][] dp=new int[M][M][M];  
        for(int i=0; i<M; i++){
            for(int j=0; j<M; j++){
                Arrays.fill(dp[i][j], -1);
            }
        }
            return solve(m,n,maxMove,startRow,startColumn,arr,dp);
        
    }
}