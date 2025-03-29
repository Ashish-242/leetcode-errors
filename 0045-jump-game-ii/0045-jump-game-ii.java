class Solution {
    public int jump(int[] nums) {
        if(nums[0]==0) return 0;
        
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=solve(nums,dp,0,0);
        return ans;
    }
    public int solve(int[] nums,int[] dp,int st,int count){
        if(st>=nums.length ) return Integer.MAX_VALUE-2;
        if(st== nums.length-1) return dp[st]=0;
        if(dp[st]!=-1) return dp[st];
        int val=nums[st];
        int mn=Integer.MAX_VALUE-2;
        for(int i=1;i<=val;i++){
            int value=1+solve(nums,dp,st+i,count);
          mn=Math.min(mn,value);
        }
        return dp[st]=mn;
    }
}