class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int i=0,j=0;
        int n=mat.length,m=mat[0].length;
       while(i<mat.length){
        if(mat[i][m-1] < target){

            i++;
        }else{
            
            while(j<m){
                if(mat[i][j]==target) return true;
                j++;
            }
            return false;
        }
       }
        return false;
    }
}