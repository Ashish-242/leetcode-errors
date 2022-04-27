class Solution {
    public int calculate(int[] dp,int N){
        if(N==0) return dp[N]=0;
        if(N <= 2) return dp[N]=1;
        if(dp[N]!=0) return dp[N];
            
            return dp[N]=calculate(dp,N-1)+ calculate(dp,N-2)+ calculate(dp,N-3);
    }
    public int tribonacci(int n) {
       
        int[] dp =new int[n+1];
      int x =  calculate(dp,n);
      return x;
        
    }
}