class Solution {
    public boolean isMatch(String s, String p) {
        int n=s.length();
        int m=p.length();
//         we make a dp because there is overlapping situations so 
        int[][] dp=new int[n+1][m+1];
        for(int[] ar:dp){
            Arrays.fill(ar,-1);
        }
       int ans=solve(n,m,s,p,dp);
      if(ans==1) return true;
        else return false;
    }
    public int solve(int n,int m,String s,String p,int[][] dp ){
//         base case
        if(n<0 && m<0) return 1;
        else if(n>0 && m<=0) return 0;
        else if(m>=0 && n<=0){
            for(int i=1;i<=m;i++){
               if(p.charAt(i-1)!='*') return 0; 
            }
           return 1;
        }
        if(dp[n][m]!=-1) return dp[n][m];
        
        
        if(s.charAt(n-1)==p.charAt(m-1) || p.charAt(m-1)=='?'){
            return dp[n][m] = solve(n-1,m-1,s,p,dp);
        }
        else if(p.charAt(m-1)=='*'){
            return dp[n][m] = solve(n,m-1,s,p,dp) | solve(n-1,m,s,p,dp);
        }else{
            return dp[n][m] =0;
        }
        
    }
}