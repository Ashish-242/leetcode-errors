class Solution {
    public String reducestar(String p){
        if(p.length()==0) return p;
           StringBuilder sb=new StringBuilder();
           sb.append(p.charAt(0));
           int k=1;
           while(k<p.length()){
          while( k <p.length() && sb.charAt(sb.length()-1) == '*' && p.charAt(k)=='*') k++;
          if(k<p.length()) sb.append(p.charAt(k));
           k++;
          }
           return sb.toString();
    }
           public int solve(String s,String p , int n, int m ,int[][] dp){
               if(n==0 && m==0) return dp[n][m]=1;
               if(m==0) return dp[n][m]=0;
               
               if(dp[n][m]!=-1) return dp[n][m];
               char ch1=n>0?s.charAt(n-1) : '$';
               char ch2=p.charAt(m-1);
               
               if(ch1!='$' && (ch1==ch2 || ch2 =='.')){
                   return solve(s,p,n-1,m-1,dp);
               }else if(ch2=='*'){
                   boolean res=false;
                   if(n>0 && m>1 && (ch1==p.charAt(m-2) || p.charAt(m-2)=='.')){
                       res=res || solve(s,p,n-1,m,dp)==1;
                   }
                   res=res|| solve(s,p,n,m-2,dp)==1;
                   return dp[n][m]= res?1:0;
               }else{
                    return dp[n][m]=0;
               }
              
           }
    public boolean isMatch(String s, String p) {
        p=reducestar(p);
        int n=s.length();
        int m=p.length();
        
        int[][] dp=new int[n+1][m+1];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        int ans=solve(s,p,n,m,dp);
        return ans==1?true:false;
    }
}