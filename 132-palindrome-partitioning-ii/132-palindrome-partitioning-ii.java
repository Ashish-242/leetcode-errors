class Solution {
      public int solve(String s,int[]dp,int si,int ei,boolean[][] pdp){
        if(pdp[si][ei]) return 0;
        if(dp[si]!=-1) return dp[si];
        int maxlen=(int) 1e8;
        for(int cut=si;cut<=ei;cut++){
            if(pdp[si][cut]){
                maxlen=Math.min(maxlen,solve(s,dp,cut+1,ei,pdp)+1);
            }
        }
        return dp[si]=maxlen;
    }
    public int minCut(String s) {
        int n=s.length();
      
       boolean[][] pdp=new boolean[n][n];
         for(int gap=0;gap<n;gap++){
            for(int i=0,j=gap;j<n;j++,i++){
                if(gap==0){
                    pdp[i][j]=true;
                }else if(gap==1 && s.charAt(i)==s.charAt(j)){
                    pdp[i][j]=true;
                }
                else {
                  pdp[i][j]=(s.charAt(i)==s.charAt(j) && pdp[i+1][j-1]);
                  
                }
            }
         }
                
          int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans =solve(s,dp,0,n-1,pdp);
          return ans;
    }
}
  