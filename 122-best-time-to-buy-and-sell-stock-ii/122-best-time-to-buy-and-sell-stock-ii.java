class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n][2];
        for(int[] ar:dp){
            Arrays.fill(ar,-1);
        }
         
        int ans=solve(0,1,prices,n,dp);
        return ans;
    }
    public int solve(int ind,int buy,int[] p,int n,int[][] dp){
        if(ind==n) return 0;
   
        if(dp[ind][buy]!=-1) return dp[ind][buy];
             int profit=0;
        if(buy==1){
           profit+=Math.max(-1*p[ind]+solve(ind+1,0,p,n,dp),solve(ind+1,1,p,n,dp)); 
        }else{
            profit+=Math.max(p[ind]+solve(ind+1,1,p,n,dp),solve(ind+1,0,p,n,dp));
        }
        return dp[ind][buy]= profit;
    }
}