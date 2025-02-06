class Pair{
    int s;
    int e;
   
    Pair(int st,int en){
        s=st;
        e=en;
        
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh=0,minutes=0;
        Queue<Pair> q=new LinkedList<>();
        int[][] dir=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2) {
                    q.add(new Pair(i,j));  
                }else if(grid[i][j]==1) fresh++;
            }
        }
       
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                Pair p=q.poll();
             if(visited[p.s][p.e]==true) continue;
                 visited[p.s][p.e]=true;
              if(grid[p.s][p.e]==1) fresh--;
              for(int i=0;i<dir.length;i++){
                int start=p.s+dir[i][0];
                int end=p.e+dir[i][1];

                if(isvalid(start,end,grid,visited)){             
                 q.add(new Pair(start,end));
                }
              }
             
            }
            if(fresh==0) break;
          minutes++;
             
        }
        if(fresh==0)
        return minutes;
        return -1;
    }
    public boolean isvalid(int st,int en,int[][] grid,boolean[][] visited){
    if(st>=0 && en>=0 && st<grid.length && en<grid[0].length && !visited[st][en] && grid[st][en]!=0) return true;
    return false;
}

}
