class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[][]dp=new int[n+1][m+1];
        for(int[]d:dp) Arrays.fill(d,-(int)1e9);
        int ans=solve(n,m,dp,nums1,nums2);
        return ans;
    }
    public int solve(int n,int m,int[][] dp,int[] arr1,int[] arr2){
        
        if(n==0 || m==0){
            return dp[n][m]=-(int)1e9;
        }
        if(dp[n][m]!=-(int)1e9) return dp[n][m];
        int val=arr1[n-1]*arr2[m-1];
        int bothnotincluded=solve(n-1,m-1,dp,arr1,arr2)+val;
        int a=solve(n-1,m,dp,arr1,arr2);
        int b=solve(n,m-1,dp,arr1,arr2);
        return dp[n][m]=findmax(val,bothnotincluded,a,b);
    }
    public int findmax(int...arr){
        int mx=arr[0];
        for(int val:arr) mx=Math.max(mx,val);
        return mx;
    }
}