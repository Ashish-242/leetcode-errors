class Solution {
    class Pair{
        int i,j,level;
        Pair(int i ,int j,int level){
            this.i=i;
            this.j=j;
            this.level=level;
        }
    }
    public int shortestBridge(int[][] grid) {
        int m=grid.length;
        int n =grid[0].length;
        boolean found=false;
        boolean[][] visited=new boolean[m][n];
        ArrayDeque<Pair> queue=new ArrayDeque<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j]==false && grid[i][j]==1){
                    
                dfs(i,j,visited,grid,queue);
                    found=true;
                
                }
                if(found==true) break;
            }
            if(found==true) break;
        }
        boolean[][] vis=new boolean[visited.length][visited[0].length];
        while(queue.size()>0){
            Pair rem=queue.remove();
            if(vis[rem.i][rem.j]) {
                continue;
            }
            vis[rem.i][rem.j]=true;
            if(grid[rem.i][rem.j]==1){
                return rem.level-1;
            }
           solvebfs(rem.i-1,rem.j,vis,grid,queue,rem.level+1);
           solvebfs(rem.i+1,rem.j,vis,grid,queue,rem.level+1);
           solvebfs(rem.i,rem.j-1,vis,grid,queue,rem.level+1);
           solvebfs(rem.i,rem.j+1,vis,grid,queue,rem.level+1);
        }
        return -1;
    }
     public void solvebfs(int i,int j,boolean[][] vis,int[][] grid,ArrayDeque<Pair> queue,int l){
         if(i<0 || j<0 || i>=grid.length || j>=grid[0].length ){
            return;
        }
        if(vis[i][j]==true) return;
        
        queue.add(new Pair(i,j,l));
    }
    
   
    
    public void dfs(int i,int j,boolean[][] visited,int[][] grid , ArrayDeque<Pair> queue){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
            return;
        }
      
        if(visited[i][j]==true){
            return;
        }
        visited[i][j]=true;
        
        dfs(i-1,j,visited,grid,queue);
           dfs(i+1,j,visited,grid,queue);
           dfs(i,j-1,visited,grid,queue);
           dfs(i,j+1,visited,grid,queue);
        queue.add(new Pair(i,j,0));
        grid[i][j]=2;
        
    }
   
}