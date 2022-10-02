class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        dp=new int[n+1][target+1];
       
        
        return noofdiceroll(n,k,target);
        
    }
    int[][] dp;
    int mod=(int)(1e9+7);
    public int noofdiceroll(int N,int K,int Tar){
        dp[0][0]=1;
        for(int n=1;n<=N;n++){
            
            for(int target=0;target<=Tar;target++){
             
                 int take=0;
                for(int k=1;k<=K;k++){

                    if(target>=k){
                        take= (take+dp[n-1][target-k])%mod;
                    }
                }
                dp[n][target]=take;
            
             }
        }
       
        return dp[N][Tar];
    }
}


// Notes-
// recursive approach is giving tle
// now we try memoization