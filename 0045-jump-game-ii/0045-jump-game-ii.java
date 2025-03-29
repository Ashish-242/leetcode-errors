class Solution {
    public int jump(int[] nums) {
        if(nums.length==1) return 0;
        int n=nums.length;
        int[] dp=new int[n+1];
        //Arrays.fill(dp,-1);
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int val=nums[i];
            int mn=Integer.MAX_VALUE-2;
            for(int j=1;j<=val;j++){
                if(i+j<dp.length){
                mn=Math.min(mn,1+dp[i+j]);
                }
            }
            
            dp[i]=mn;
        }
        for(int i=0;i<dp.length;i++){
            System.out.println(dp[i]);
        }
        return dp[0];
    }
}