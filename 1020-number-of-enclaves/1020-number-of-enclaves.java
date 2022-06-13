class Solution {
    int count=0;
    int len=0;
    boolean flag=true;
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n =grid[0].length;
        
        
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1  && visited[i][j]==false){
                  count=0;
                    
                    traverse(grid,visited,i,j);
                    if(flag==true){
                        len+=count;
                    }
                    
                }
                flag=true;
            }
            
        }
        return len;
            
        }
    public void traverse(int[][] grid, boolean[][] visited,int i,int j){ 
                         
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length){
            flag=false;
            return;
        } 
        else if(visited[i][j]==true) return;
        else if(grid[i][j]==0) return;
  
        
        count++;
        visited[i][j]=true;
       
         traverse(grid,visited,i-1,j);
         traverse(grid,visited,i+1,j);
         traverse(grid,visited,i,j-1);
         traverse(grid,visited,i,j+1);
        
    }
}