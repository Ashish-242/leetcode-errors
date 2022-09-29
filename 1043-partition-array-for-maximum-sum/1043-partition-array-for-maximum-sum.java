class Solution {
    public int solve(int[] arr,int idx,int k , int n,int[] dp){
        if(idx==n) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int maxi=Integer.MIN_VALUE;
        int maxans=Integer.MIN_VALUE;
        int len=0;
        int sum=0;
        for(int j=idx;j<Math.min(idx+k,n);j++){
            len++;
            maxi=Math.max(maxi,arr[j]);
            sum=maxi*len+solve(arr,j+1,k,n,dp);
            maxans=Math.max(maxans,sum);
            
        }
        return dp[idx]=maxans;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=solve(arr,0,k,n,dp);
        return ans;
    }
}