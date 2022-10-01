class Solution {
    public int nthUglyNumber(int n) {
        int[] dp=new int[n];
        dp[0]=1;
         int p1=0;/*pointer for 2*/
        int p2=0;/*pointer for 3*/
        int p3=0;/*pointer for 5*/
        for(int i=1;i<n;i++){
             int twomultiple=dp[p1]*2;
        int threemultiple=dp[p2]*3;
        int fivemultiple=dp[p3]*5; 
            dp[i]=Math.min(twomultiple,Math.min(threemultiple,fivemultiple));
            if(dp[i]==twomultiple) p1++;
            if(dp[i]==threemultiple) p2++;
            if(dp[i]==fivemultiple) p3++;
      
        }
        return dp[n-1];

    }
}