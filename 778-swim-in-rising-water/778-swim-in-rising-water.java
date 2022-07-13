class Solution {

     class Pair implements Comparable<Pair>{
        int i;
        int j;
        int t;
        Pair(int i,int j,int t){
            this.i=i;
            this.j=j;
            this.t=t;
        }
       public int compareTo(Pair o){
            return this.t-o.t;
        }
    }
    int m;
    int n;
    public int swimInWater(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
       
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        boolean[][] vis=new boolean[m][n];
        pq.add(new Pair(0,0,grid[0][0]));
        while(pq.size()>0){
//             remove
            Pair rem=pq.remove();
            if(vis[rem.i][rem.j]==true) continue;
            vis[rem.i][rem.j]=true;
            
            if(rem.i==m-1 && rem.j==n-1){
                return rem.t;
            
            }
            
//             calls
            solve(rem.i,rem.j+1,vis,rem.t,grid,pq);
            solve(rem.i-1,rem.j,vis,rem.t,grid,pq);
            solve(rem.i,rem.j-1,vis,rem.t,grid,pq);
            solve(rem.i+1,rem.j,vis,rem.t,grid,pq);
            
        }
        return -1;
    }
    // public void solve(int x,int y,boolean[][] visited,int t,int[][] grid,PriorityQueue<Pair> pq){
    //     if(x<0 || y<0 || visited[x][y]==true || x>=m || y>=n){
    //         return;
    //     }
    //    pq.add(new Pair(x,y,Math.max(grid[x][y],t)));
    // }
    public void solve(int i,int j,boolean[][] visited,int t,int[][] grid,PriorityQueue<Pair> pq){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j]==true){
            return;
        }
        pq.add(new Pair(i,j,Math.max(t,grid[i][j])));
    }
}