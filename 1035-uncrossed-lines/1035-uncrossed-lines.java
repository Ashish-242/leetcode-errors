class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int N=nums1.length,M=nums2.length;
        int[][] dp=new int[N+1][M+1];
        for(int n=0;n<=N;n++){
            for(int m=0;m<=M;m++){
                
         if(n==0 || m==0){
           dp[n][m]=0;
             continue;
         } 
            if(nums1[n-1]==nums2[m-1]){
             dp[n][m]=1+dp[n-1][m-1];
            }else{
            int b=dp[n-1][m];
            int c=dp[n][m-1];
            dp[n][m]=Math.max(b,c);
             }
         
            }
        }
        return dp[N][M];

        
      
     }
    
}