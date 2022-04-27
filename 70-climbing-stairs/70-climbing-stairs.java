class Solution {
//     Memoization approach dp 
    public int steps(int[] dp,int n){
        if(n<=1) return 1;
        if(dp[n]!=0) return dp[n];
        return dp[n]=steps(dp,n-1)+steps(dp,n-2);
        
    }
    
      public int steps2(int[] dp,int n){
      for(int i=0;i<n;i++){
            if(n<=1) {
                dp[n]= 1;
                continue;
            }
       
       dp[n]=steps(dp,n-1)+steps(dp,n-2);
      }
          return dp[n];
        
    }
    
    public int climbStairs(int n) {
        int []dp=new int[n+1];
        // int x= steps(dp,n);
        int x=steps2(dp,n);
        return x;
        
    }
}