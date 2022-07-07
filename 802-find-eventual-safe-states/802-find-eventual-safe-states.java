class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int[] visited= new int[graph.length];
        List<Integer> l=new ArrayList<>();
        
        for(int i=0;i<graph.length;i++){
        boolean issafe=dfs(i,graph,visited);
            if(issafe) l.add(i);
        }
        return l;
    }
    public boolean dfs(int v,int[][] graph,int[] visited){
        if(visited[v]==2) return true;
        else if(visited[v]==1) return false;
//         it detect cycle or it has both nbr unsafe nodes or any one unsafe node becuase is both the node are safe then it also becomes safe node 
        else{
            visited[v]=1;
            for(int n:graph[v]){
            boolean isnbr=dfs(n,graph,visited);
            if(!isnbr) return false;
        }  
        }
        
      
        visited[v]=2;
        return true;
    }
}