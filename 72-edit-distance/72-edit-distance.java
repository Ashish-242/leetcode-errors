class Solution {
    public int distance(String s1,String s2,int n,int m , int[][] dp ){
        if(n==0 || m==0) return dp[n][m]=n!=0?n:m;
        if(dp[n][m]!=-1) return dp[n][m]; 
        
        int a =distance(s1,s2,n-1,m-1,dp);
        int b=distance(s1,s2,n,m-1,dp);
           int c=distance(s1,s2,n-1,m,dp);
        
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            dp[n][m]=a;
        }else{
            dp[n][m]=Math.min(Math.min(b,c),a)+1;
        }
        return dp[n][m];
    }
    public int minDistance(String s1, String s2) {
        int n =s1.length();
        int m =s2.length();
        int[][] dp=new int[n+1][m+1];
        for(int[] d: dp ){
            Arrays.fill(d,-1);
            
        }
         return distance(s1,s2,n,m,dp);
    }
}