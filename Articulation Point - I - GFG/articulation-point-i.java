// { Driver Code Starts
// Initial Template for Java
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
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
            for(int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++){
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer>ans = obj.articulationPoints(V, adj);
            for (int i =0 ;i < ans.size (); i++) 
                System.out.print (ans.get (i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> articulationPoints(int V,ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] visited=new boolean[V];
        int[] dis=new int[V];
        int[] low=new int[V];
        boolean[] ap=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(adj,visited,dis,low,ap,0,-1);
            }
        }
        
        int nos=0;
          for(boolean a:ap){
             if(a) nos++;
         }
          ArrayList<Integer> list=new ArrayList<>();
        if(nos==0){
            ArrayList<Integer>x=new ArrayList<>();
            x.add(-1);
            return x;
        }else{
           
            for(int i=0;i<ap.length;i++){
                if(ap[i]) list.add(i);
            }
            
            
        }
    
        return list;
        
    }
   
    int time=0;
    public void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] visited,int[] dis,int[] low,boolean[] ap,int u,int p){
        visited[u]=true;
        dis[u]=low[u]=++time;
         int count=0;
       
        for(int nbr:adj.get(u)){
            if(nbr==p) continue;
            else if(visited[nbr]){
                low[u]=Math.min(low[u],dis[nbr]);
            }else{
                count++;
                dfs(adj,visited,dis,low,ap,nbr,u);
                low[u]=Math.min(low[u],low[nbr]);
                
                if(p!=-1 && low[nbr]>=dis[u]){
                    ap[u]=true;
                }
            }
        }
        if(p==-1 && count>1){
            ap[u]=true;
        }
    }
}