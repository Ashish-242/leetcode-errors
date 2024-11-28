class Solution {
    public int minimumObstacles(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int[][] dist=new int[grid.length][grid[0].length];
        int[][] direction=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        for(int[] d :dist){
            Arrays.fill(d,Integer.MAX_VALUE);
        }
        Deque<int[]> q=new ArrayDeque<>();
        dist[0][0]=0;
        q.add(new int[]{0,0});
        while(!q.isEmpty()){
          
                int[] current=q.pop();
                int x=current[0];
                int y=current[1];
                for(int[] d :direction){
                    int nx=x+d[0];
                    int ny=y+d[1];
                    if(nx>=0 && ny>=0 && nx<grid.length && ny<grid[0].length){
                        int newval=dist[x][y] + grid[nx][ny];
                        if(newval<dist[nx][ny]){
                            dist[nx][ny]=newval;

                            if(grid[nx][ny]==0)
                            q.addFirst(new int[]{nx,ny});
                            else q.addLast(new int[]{nx,ny});
                        }
                    }
                }
            
        }
        return dist[grid.length-1][grid[0].length-1];
    }
}