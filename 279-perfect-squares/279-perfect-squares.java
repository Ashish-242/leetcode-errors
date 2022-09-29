class Solution {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
       
        for(int i=1;i<dp.length;i++){
            
            dp[i]=dp[i-1]+1;
             int j=2;
            while(i-j*j>=0){
                int x=Math.min(dp[i-j*j]+1,dp[i]);
                dp[i]=x;
                j++;
            }
        }
        return dp[n];
    }
}