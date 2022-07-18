class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        // int ans=mem(n-1,nums,dp);
        int ans=tabu(n,nums,dp);
        
        
        return ans;
    }
//     int x=0;
//     public int mem(int n,int[] arr,int[] dp){
//        if(n==0) return dp[n]=arr[n];
//         if(n<0) return 0;
//         if(dp[n]!=-1) return dp[n];
//         int pick=arr[n]+mem(n-2,arr,dp);
//         int npick=mem(n-1,arr,dp);
//         dp[n]=Math.max(pick,npick);
//         return dp[n];
        
//     }
     // }
    int x=0;
    public int tabu(int N,int[] arr,int[] dp){
        for(int n=0;n<N;n++){
            if(n==0) {
               dp[n]=arr[0];
                continue;
            } 
       
        
        int pick=arr[n];
        if(n-2>=0) pick+=dp[n-2];
        int npick=dp[n-1];
        dp[n]=Math.max(pick,npick);
        
        }
        return dp[N-1];

        
    }
}