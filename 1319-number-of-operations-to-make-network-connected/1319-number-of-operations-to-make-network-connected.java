class Solution {
     public  int makeConnected(int n, int[][] is) {
   if((n-1)>is.length) return -1;
        boolean[] visited=new boolean[n];
         ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
         for(int i=0;i<n;i++){
             graph.add(new ArrayList<>());
         }
         for(int[] s:is){
             int x=s[0];
             int y=s[1];
             graph.get(x).add(y);
             graph.get(y).add(x);
         }
        int result=0;
        for(int i=0;i<n;i++){
            if(visited[i]==false ){
               dfs(i,visited,graph);
          
                result++;
            }
        }
        return result-1;
  }
    public  void dfs(int i,boolean[] vis,ArrayList<ArrayList<Integer>> graph){
        vis[i]=true;
        for(int x:graph.get(i)){
         
                if(vis[x]==false){
                    dfs(x,vis,graph);
                }
            
        }
    }
}


    
 