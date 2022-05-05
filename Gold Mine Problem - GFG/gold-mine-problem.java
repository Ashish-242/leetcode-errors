// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} // } Driver Code Ends


//User function Template for Java

class Solution{
     public static void cal(int n,int m ,int M[][], int dp[][]){
       
for(int  j=m-1;j>=0;j--){
    for(int i=n-1;i>=0;i--){
        if( j==m-1){
            dp[i][j]=M[i][j];
            continue;
        } else if(n==1 && i==0 && j<m-1) dp[i][j]=M[i][j]+dp[i][j+1];
        else if(i==0 && j<m-1 && n!=1 ) dp[i][j]=M[i][j] + Math.max(dp[i][j+1],dp[i+1][j+1]);
        else if(i==n-1 && j<m-1) dp[i][j]= M[i][j] + Math.max(dp[i][j+1],dp[i-1][j+1]);
        else if(i<n-1 && j<m-1) {
        dp[i][j]=Math.max(dp[i+1][j+1],Math.max(dp[i][j+1],dp[i-1][j+1]))+ M[i][j];
        }
    }
}
    }
    static int maxGold(int n, int m, int M[][])
    {
        int[][] dp =new int[n][m];
        
        cal(n,m,M,dp);
        int max=0;
        for(int i=0;i<n;i++){
            if(dp[i][0] >max) max= dp[i][0];
        }
        return max;
    }
}