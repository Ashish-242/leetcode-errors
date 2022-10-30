class Solution {
    public long numberOfWays(String s) {
        int n=s.length();
        long[][][] dp=new long[4][4][n];
           
                for(long[][] d2:dp)
                    for(long[] d3:d2)
                        Arrays.fill(d3,-1);

      return solve(s,0,3,dp,'2');
        
    }
    public long solve(String s,int i,int k,long[][][] dp,char prev){
        if(k==0){
            return 1;
        }
        if(i>=s.length()){
            return 0;
        }
       if(dp[k][prev-'0'][i]!=-1) return dp[k][prev-'0'][i];
        long nottake=0+solve(s,i+1,k,dp,prev);
        long take=0;
        if( prev!=s.charAt(i)){
            take=solve(s,i+1,k-1,dp,s.charAt(i));
        }
        return dp[k][prev-'0'][i]=(take+nottake);
    }
}