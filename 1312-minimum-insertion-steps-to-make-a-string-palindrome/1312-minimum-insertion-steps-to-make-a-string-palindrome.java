class Solution {
    public int minInsertions(String s) {
//         longestpalidnromicsubsequence
        int n=s.length();
        char[] ch=s.toCharArray();
        int[][] dp=new int[n+1][n+1];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        int ans=solve(0,n-1,dp,ch);
        int minimumsteps=n-ans;
        return minimumsteps;
        
    }
    public int solve(int n,int m,int[][] dp,char[]ch){
        if(n==m){
            return 1;
        }else if(n>m){
            return 0;
        }
        
        if(dp[n][m]!=-1) return dp[n][m];
        int a=solve(n+1,m-1,dp,ch);
        int b=solve(n+1,m,dp,ch);
        int c=solve(n,m-1,dp,ch);
        if(ch[n]==ch[m]){
            dp[n][m]=a+2;
        }else{
            dp[n][m]=Math.max(b,c);
        }
        return dp[n][m];
    }
}