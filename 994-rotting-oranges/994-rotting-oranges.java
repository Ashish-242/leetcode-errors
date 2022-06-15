class Solution {
    class Pair{
        int i;
        int j;
        int t;
        Pair(int i,int j,int t){
            this.i=i;
            this.j=j;
            this.t=t;
        }
        
    }
    
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n =grid[0].length;
        int fresh=0;
        ArrayDeque<Pair> queue=new ArrayDeque<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 2){
                    queue.add(new Pair(i,j,0));
                }else if(grid[i][j]==1){
                     fresh++;
                }
            }
        }
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        int time=0;
 
//          remove
        while(queue.size()>0){
             Pair rem=queue.remove();
//            mark
            if(visited[rem.i][rem.j]==true) continue;
            
            visited[rem.i][rem.j]=true;
//             work
            time=rem.t;
            
            if(grid[rem.i][rem.j]==1) fresh--;
            
//             calls
            if(rem.i-1>=0) solve(rem.i-1,rem.j,grid,visited,rem.t+1,queue);
             
            if(rem.i+1<grid.length) solve(rem.i+1,rem.j,grid,visited,rem.t+1,queue);
             if(rem.j+1<grid[0].length) solve(rem.i,rem.j+1,grid,visited,rem.t+1,queue);
             if(rem.j-1>=0) solve(rem.i,rem.j-1,grid,visited,rem.t+1,queue);
        }
       if(fresh==0) return time;
        return -1;
        
        
    }
    public void solve(int i ,int j ,int[][] grid, boolean[][] visited,int ts,  ArrayDeque<Pair> queue){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) return;
        else if(visited[i][j]) return;
        else if(grid[i][j]==0) return;
        
        
        queue.add(new Pair(i,j,ts));
        
    }
}