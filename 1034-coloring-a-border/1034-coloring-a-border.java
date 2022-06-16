class Solution {
    
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        
        int orignalcolor=grid[row][col];
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        dfs(grid,row,col,orignalcolor,visited);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]<0){
                    grid[i][j]=color;
                }
            }
        }
        return grid;
    }
    public void dfs(int[][] grid,int i,int j,int color, boolean[][] visited){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length ||grid[i][j]!=color){
            return;
        }
        if(visited[i][j]){
            return;
        } 
        visited[i][j]=true;
        grid[i][j]=(-1)*color;
        
//         calls
        dfs(grid,i-1,j,color,visited);
        dfs(grid,i+1,j,color,visited);
        dfs(grid,i,j-1,color,visited);
        dfs(grid,i,j+1,color,visited);
        
        if(i!=0 && j!=0 && i!=grid.length-1 && j!=grid[0].length-1 && Math.abs(grid[i-1][j])==Math.abs(grid[i][j]) && Math.abs(grid[i+1][j])==Math.abs(grid[i][j]) && Math.abs(grid[i][j+1])==Math.abs(grid[i][j]) && Math.abs(grid[i][j-1])==Math.abs(grid[i][j]) ){
            grid[i][j]=(-1)*grid[i][j];
        }
        
        
    }
}