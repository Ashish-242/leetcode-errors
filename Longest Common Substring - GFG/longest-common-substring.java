// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2, n, m));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    int result=0;
    public int commonsequence(String s1,String s2,int n,int m,int[][]dp){
        if(n==0 || m==0) return dp[n][m]=0;
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
       
      int a=commonsequence(s1,s2,n-1,m-1,dp);
      int b=commonsequence(s1,s2,n,m-1,dp);
      int c=commonsequence(s1,s2,n-1,m,dp);
        if(s1.charAt(n-1)==s2.charAt(m-1)){
           dp[n][m]= a+1;
           result=Math.max(result,dp[n][m]);
        }else{
            dp[n][m]= 0;
        }
        return dp[n][m];
    }
    int longestCommonSubstr(String S1, String S2, int n, int m){
        int nn=S1.length();
        int mm=S2.length();
        int[][] dp =new int[nn+1][mm+1];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
      int x= commonsequence(S1,S2,nn,mm ,dp);
      return result;
      
    }
}