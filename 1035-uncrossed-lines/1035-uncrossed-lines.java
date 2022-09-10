class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int N=nums1.length,M=nums2.length;
        int[][] dp=new int[N+1][M+1];
        for(int [] d:dp){
            Arrays.fill(d,-1);
            
        }
        int x=solve(N,M,dp,nums1,nums2);
        return x;
     }
    public int solve(int n,int m,int[][] dp,int[] nums1,int[] nums2){
        if(n==0 || m==0) return 0;
        
        if(dp[n][m]!=-1) return dp[n][m];
        if(nums1[n-1]==nums2[m-1]){
             dp[n][m]=1+solve(n-1,m-1,dp,nums1,nums2);
        }else{
            int b=solve(n-1,m,dp,nums1,nums2);
            int c=solve(n,m-1,dp,nums1,nums2);
            dp[n][m]=Math.max(b,c);
        }
        return dp[n][m];
    }
}