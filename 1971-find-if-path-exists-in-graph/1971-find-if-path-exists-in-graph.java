class Solution {
     boolean idx=false;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] visited=new boolean[n];
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u =edges[i][0];
            int v=edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
       dfs(source,destination,visited,graph);
     
        return idx;
    
    }
    public void dfs(int s,int d,boolean[] visited,  ArrayList<ArrayList<Integer>> graph){
        
        visited[s]=true;

        if(s==d){
            idx=true;
            return;
        } 
        for(int x:graph.get(s)){
           
                 if(visited[x]) continue;
            dfs(x,d,visited,graph);
            
           
        }
    }
}