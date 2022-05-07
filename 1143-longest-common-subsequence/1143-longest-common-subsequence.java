class Solution {
    public int longestcommonsubsequence_memo(String s1,String s2,int n,int m, int[][] dp){
        if(n==0 || m==0) return dp[n][m]=0;
        if(dp[n][m]!=0) return dp[n][m];
        
        int a=longestcommonsubsequence_memo(s1,s2,n-1,m-1,dp);
        int b=longestcommonsubsequence_memo(s1,s2,n-1,m,dp);
        int c=longestcommonsubsequence_memo(s1,s2,n,m-1,dp);
        
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            dp[n][m]=a+1;
        }else{
            dp[n][m]=Math.max(b,c);
        }
        return dp[n][m];
        
        
    }
    public int longestCommonSubsequence(String s1, String s2) {
        
        int n = s1.length();
        int m =s2.length();
        int[][] dp = new int[n+1][m+1];
        int x =longestcommonsubsequence_memo(s1,s2,n,m,dp);
        return x;
    }
}