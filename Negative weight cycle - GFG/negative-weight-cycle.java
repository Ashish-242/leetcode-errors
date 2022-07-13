// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] edges = new int[m][3];
            for(int i = 0; i < m; i++){
                String S2[] = br.readLine().trim().split(" ");
                for(int j = 0; j < 3; j++)
                    edges[i][j] = Integer.parseInt(S2[j]);
            }
            Solution obj = new Solution();
            int ans = obj.isNegativeWeightCycle(n, edges);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int isNegativeWeightCycle(int N, int[][] arr)
    {
          int[] path=new int[N];
           Arrays.fill(path,Integer.MAX_VALUE);
           path[0]=0;
           for(int i=0;i<N-1;i++){
               for(int j=0;j<arr.length;j++){
                   int u=arr[j][0];
                   int v=arr[j][1];
                   int w=arr[j][2];
                   if(path[u]==Integer.MAX_VALUE) continue;
                   else if(path[u]+w<path[v]){
                       path[v]=path[u]+w;
                   }
               }
           }
           for(int j=0;j<arr.length;j++){
                   int u=arr[j][0];
                   int v=arr[j][1];
                   int w=arr[j][2];
                   
                if(path[u]+w<path[v]){
                    return 1;
                   }
               }
  return 0;
    }
}