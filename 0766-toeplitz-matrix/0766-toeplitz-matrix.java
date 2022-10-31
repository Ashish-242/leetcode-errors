class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int i=0;
        int j=0;
        while(i<matrix.length-1){
            while(j<matrix[0].length-1){
                int x=matrix[i][j];
            int y=matrix[i+1][j+1];
            if(x!=y) return false;
            else{
                j++;
            }
            }
            i++;
            j=0;
            
        }
        return true;
    }
}