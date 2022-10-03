class Solution {
    public int minCost(String s, int[] cost) {
        int ans=0;
        int sum=0;
        int maxele=0;
        for(int i=0;i<s.length();i++){
         if( i>0 && s.charAt(i) !=s.charAt(i-1)){
            ans+=sum-maxele;
             sum=0;
             maxele=0;
         }
            sum+=cost[i];
            maxele=Math.max(maxele,cost[i]);
        }
        ans+=sum-maxele;
        return ans;
    }
}