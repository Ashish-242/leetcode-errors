// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Gfg
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            // arraylist of arraylist to represent graph
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            int V = Integer.parseInt(sc.next());
            int E = Integer.parseInt(sc.next());
            
            for(int i =0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
                
            for(int i = 1; i <= E; i++)
            {    int u = Integer.parseInt(sc.next());
                 int v = Integer.parseInt(sc.next());
                 
                 // adding directed edgese between 
                 // vertex 'u' and 'v'
                 adj.get(u).add(v);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.kosaraju(V, adj));
		}
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        Stack<Integer> st=new Stack<>();
        boolean[] visited=new boolean[V];
        for(int v =0;v<V;v++){
            if(!visited[v]){
                dfs(v,visited,st,adj);
                
            }
        }
        
        // Transpose
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
       
        for(int i=0;i<V;i++){
        list.add(new ArrayList<>());
        }
        for(int j=0;j<V;j++){
            for(int nbr:adj.get(j)){
                
                list.get(nbr).add(j);
            }
        }
        
        
        int count=0;
         boolean[] vis=new boolean[V];
        while(st.size()>0){
            int vv=st.pop();
                if(vis[vv]==false){
                dfs1(vv,vis,st,list);
                count++;
                }
            
        }
        return count;
    }
      public void dfs1(int v,boolean[] vis,Stack<Integer> st, ArrayList<ArrayList<Integer>>list){
        vis[v]=true;
        for(int n:list.get(v)){
            if(vis[n]==false){
                dfs(n,vis,st,list);
            }
        }
     
    }
    public void dfs(int v,boolean[] visited,Stack<Integer> st, ArrayList<ArrayList<Integer>>adj){
        visited[v]=true;
        for(int n:adj.get(v)){
            if(visited[n]==false){
                dfs(n,visited,st,adj);
            }
        }
        st.push(v);
    }
}
