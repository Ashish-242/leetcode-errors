class Solution {
    public int maxProfit(int[] p) {
        int n=p.length;
        int mini=0;
        int minv=p[0];
        int maxp=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            int cost=p[i]-minv;
            maxp=Math.max(cost,maxp);
            minv=Math.min(minv,p[i]);
        }
        return maxp;
    }
}