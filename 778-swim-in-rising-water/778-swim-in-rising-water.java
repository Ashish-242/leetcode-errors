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
    public int swimInWater(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int time=0;
     boolean[][] visited=new boolean[m][n];
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(0,0,grid[0][0]));
        
        while(pq.size()>0){
            Pair rem=pq.remove();
            if(visited[rem.i][rem.j]==true) continue;
            visited[rem.i][rem.j]=true;
           
            if(rem.i==m-1 && rem.j==n-1){
                return rem.t;
            }
//             calls
            solve(rem.i-1,rem.j,rem.t,grid,visited,pq);
            solve(rem.i+1,rem.j,rem.t,grid,visited,pq);
            solve(rem.i,rem.j+1,rem.t,grid,visited,pq);
            solve(rem.i,rem.j-1,rem.t,grid,visited,pq);
        }
        return -1;
    }
    public void solve(int i,int j,int t,int[][] grid,boolean[][] visited,PriorityQueue<Pair> pq){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j]==true){
            return;
        }
        pq.add(new Pair(i,j,Math.max(t,grid[i][j])));
    }
}