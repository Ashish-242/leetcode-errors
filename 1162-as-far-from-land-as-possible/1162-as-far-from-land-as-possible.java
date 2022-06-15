class Solution {
    class Pair{
      int i,j,level;
        Pair(int i,int j,int level){
            this.i=i;
            this.j=j;
            this.level=level;
        }
    }
    
    public int maxDistance(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        int length=0;
        boolean[][] visited=new boolean[m][n];
        ArrayDeque<Pair> queue=new ArrayDeque<>();
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    queue.add(new Pair(i,j,0));
                }else {
                    count++;
                }
            }
        }
        if(queue.size()==0) return -1;
        if(count==0) return-1;
        
        
        while(queue.size()>0){
            Pair rem=queue.remove();
//             remove,mark,work,call
            if(visited[rem.i][rem.j]==true) continue;
            visited[rem.i][rem.j]=true;
        length=rem.level;
          
            
            solve(rem.i-1,rem.j,visited,grid,queue,rem.level+1);
            solve(rem.i+1,rem.j,visited,grid,queue,rem.level+1);
            solve(rem.i,rem.j+1,visited,grid,queue,rem.level+1);
            solve(rem.i,rem.j-1,visited,grid,queue,rem.level+1);
            
        }
        return length;
    }
    public void solve(int i,int j,boolean[][] visited,int[][] grid,ArrayDeque<Pair>queue,int l){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length){
            return;
        }
        else if(visited[i][j]) return;
        else if(grid[i][j]==1) return;
        
        queue.add(new Pair(i,j,l));
    }
       
}


    