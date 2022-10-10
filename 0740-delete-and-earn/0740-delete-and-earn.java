class Solution {
    public int deleteAndEarn(int[] nums) {
       int mx=0;
      if(nums.length==1) return nums[0];
        for(int i=0;i<nums.length;i++){
            mx=Math.max(mx,nums[i]);
        }
          
        int[] arr=new int[10001];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]+=nums[i];
//             storing sum of every no frquencey
        }
        Arrays.sort(nums);
        int[] dp=new int[mx+1];
        return solve(dp.length-1,dp,arr);
    }
    public int solve(int n,int[] dp,int[] arr){
     if(n<=0) return 0;
        if(dp[n]!=0) return dp[n];
    int takefirst=arr[n]+solve(n-2,dp,arr);
        int second=solve(n-1,dp,arr);
        return dp[n]=Math.max(takefirst,second);
    }
}