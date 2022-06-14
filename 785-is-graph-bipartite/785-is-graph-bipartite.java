class Solution {
//     Pair we use for bfs traversal not for dfs
    // class Pair{
    //     int v;
    //     int color;
    //     Pair(int v,int color){
    //         this.v=v;
    //         this.color=color;
    //     }
    // }
    public boolean isBipartite(int[][] graph) {
        int[] visited=new int[graph.length];
      for(int i =0;i<graph.length;i++){
          if(visited[i]==0){
              boolean isgraph=solve(graph,visited,i,1);
              if(isgraph==false) return false;
          }
      }
         return true;
    }
    public boolean solve(int[][] graph,   int[] visited, int v,int color){
        visited[v]=color;
        for(int nbr : graph[v]){
            if(visited[nbr]==0)  /*if it is false*/{
                boolean id=solve(graph,visited,nbr,color*(-1));
                if(id==false) return false;
                
            }else{
                int originalcolor=visited[v];
                int newcolor=visited[nbr];
                if(originalcolor==newcolor){
                    return false;
                }
            } 
                
        }
        return true;
    }
   
}