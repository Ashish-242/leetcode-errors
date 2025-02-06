class Solution {
    class Pair{
        int r;
        int c;
        Pair(int r,int c){
            this.r=r;
            this.c=c;
        }
    }
    public int orangesRotting(int[][] grid) {
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        int fresh=0;
        Queue<Pair> q=new LinkedList<>();
        boolean[][] visited=new boolean[n][m];
        int[][] dir=new int[][]{{-1,0},{0,-1},{1,0},{0,1}};
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2 && visited[i][j]==false){
                   q.add(new Pair(i,j));
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        
        while(!q.isEmpty()){
            int s=q.size();
           
            while(s-->0){
                Pair p=q.poll();
                if(visited[p.r][p.c]==true) continue;
                 visited[p.r][p.c]=true;
                 
                if(grid[p.r][p.c]==1) fresh--;
                for(int i=0;i<dir.length;i++){
                    int x=p.r+dir[i][0];
                    int y=p.c+dir[i][1];
                    if(isvalid(x,y,grid,visited)){
                        q.add(new Pair(x,y));
                       
                    }
                }
            }
            if(fresh==0) break;
             else count++;
            
        }
        if(fresh==0) return count;
       
        return -1;
    }
    public boolean isvalid(int i,int j,int[][] grid,boolean[][] visited){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j]|| grid[i][j]==0 || grid[i][j]==2) return false;
        return true;

    }
}