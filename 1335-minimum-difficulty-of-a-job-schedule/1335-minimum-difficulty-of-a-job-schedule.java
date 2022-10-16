class Solution {
    public int minDifficulty(int[] job, int d) {
        int n=job.length;
        if(d>n) return -1;
        int[][] dp=new int[301][11];
        for(int[] dq:dp){
            Arrays.fill(dq,-1);
        }
         return solve(0,n,job,dp,d);
    }
    public int solve(int idx,int n,int[] job,int[][] dp,int d){
   
        if(d==1){
            int mxm=Integer.MIN_VALUE;
            for(int i=idx;i<job.length;i++){
                mxm=Math.max(mxm,job[i]);
            }
            return mxm;
        }
        if(dp[idx][d]!=-1){
            return dp[idx][d];
        }
             int mx=Integer.MAX_VALUE;
        int x=0;
        for(int cut=idx;cut<n-d+1;cut++){
             x=Math.max(x,job[cut]); 
            mx=Math.min(mx,x + solve(cut+1,n,job,dp,d-1));
        }
       return dp[idx][d]=mx;
    }
}