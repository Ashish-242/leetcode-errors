class Solution {
    public int longestPalindromeSubseq(String s) {
        int N=s.length();
        int i=0;
        int j=N-1;
        int[][] dp=new int[N][N];
        for(int[] ar:dp){
            Arrays.fill(ar,-1);
        }
        int x=mem(i,j,s,dp);
        return x;
    }
    public int mem(int i,int j,String s,int[][] dp){
        if(i>=j){
            return i==j?1:0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)==s.charAt(j)){
            dp[i][j]=mem(i+1,j-1,s,dp)+2;
        }else{
            dp[i][j]=Math.max(mem(i+1,j,s,dp),mem(i,j-1,s,dp));
        }
        return dp[i][j];
    }
}