class Solution {
    public boolean isMatch(String pattern, String wild) {
        int n=wild.length(),m=pattern.length();
        Boolean[][] dp=new Boolean[n+1][m+1];
 
        boolean ans=solve(n-1,m-1,wild,pattern,dp);
        return ans;
    }
    public  boolean solve(int n,int m,String w,String pattern,Boolean[][] dp)
    {
        if(n<0 && m<0) return true;
        else if(n<0 && m>=0) return false;
        else if(m<0){
            for(int i=0;i<=n;i++){
               if(w.charAt(i)!='*') return false; 
            }
           return true;
        }
        if(dp[n][m]!=null) return dp[n][m];
        
        if(w.charAt(n)==pattern.charAt(m) || w.charAt(n)=='?'){
             dp[n][m]=solve(n-1,m-1,w,pattern,dp);
        }
        else if(w.charAt(n)=='*'){
            dp[n][m]=solve(n-1,m,w,pattern,dp) || solve(n,m-1,w,pattern,dp);
        }
        else dp[n][m]=false;
        return dp[n][m];
    }
}