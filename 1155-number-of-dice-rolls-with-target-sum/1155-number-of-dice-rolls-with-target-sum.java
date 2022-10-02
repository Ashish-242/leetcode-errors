class Solution {
    public int numRollsToTarget(int n, int k, int target) {
          dp=new int[n+1][target+1];
        for(int[] d:dp) Arrays.fill(d,-1);
        
        return noofdiceroll(n,k,target);
        
    }
    int[][] dp;
    int mod=(int)(1e9+7);
    public int noofdiceroll(int n,int k,int target){
        if(n==0){
            if(target==0) return 1;
            
        }
        if(target<0 || n<=0) return 0;
        if(dp[n][target]!=-1) return dp[n][target];
        
        int take=0;
        for(int i=1;i<=k;i++){
            take= (take%mod+ (noofdiceroll(n-1,k,target-i))%mod)%mod;
        }
        return dp[n][target]=take;
    }
}


// Notes-
// recursive approach is giving tle
// now we try memoization