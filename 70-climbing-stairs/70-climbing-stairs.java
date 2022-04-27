class Solution {
    
    public int steps(int[] dp,int n){
        if(n<=1) return 1;
        if(dp[n]!=0) return dp[n];
        return dp[n]=steps(dp,n-1)+steps(dp,n-2);
        
    }
    public int climbStairs(int n) {
        int []dp=new int[n+1];
        int x= steps(dp,n);
        return x;
        
    }
}