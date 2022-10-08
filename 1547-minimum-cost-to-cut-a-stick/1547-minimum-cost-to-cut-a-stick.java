class Solution {
    public int minCost(int n, int[] cuts) {
        ArrayList<Integer> r=new ArrayList<>();
        for(int cut:cuts){
            r.add(cut);
        }
        r.addAll(Arrays.asList(0,n));
        int len=cuts.length;
        Collections.sort(r);
        int[][] dp=new int[len+1][len+1];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        return solve(1,cuts.length,r,dp);
        
    }
    public int solve(int si,int ei,ArrayList<Integer> res,int[][] dp){
        if(si>ei) return 0;
        if(dp[si][ei]!=-1) return dp[si][ei];
        int minans=Integer.MAX_VALUE;
        for(int i=si;i<=ei;i++){
            int cost=res.get(ei+1)-res.get(si-1) + solve(si,i-1,res,dp) + solve(i+1,ei,res,dp);
            minans=Math.min(minans,cost);
            
        }
        return dp[si][ei]=minans;
    }
    
}