// class Solution {
//     public void setZeroes(int[][] matrix) {
     
//       HashSet<Integer> set1=new HashSet<>();
//          HashSet<Integer> set2=new HashSet<>();
//         for(int i=0;i<matrix.length;i++){
//             for(int j =0;j<matrix[0].length;j++){
//                 if(matrix[i][j]==0){
//                     set1.add(i);
//                     set2.add(j);
//                 }
//             }
        
//         }
        
        
//           for(int i=0;i<matrix.length;i++){
//             for(int j =0;j<matrix[0].length;j++){
//                 if(set1.contains(i) || set2.contains(j)){
//                     matrix[i][j]=0;
//                 }
//             }
        
//         }
//     }
    
// }


class Solution {
    public void setZeroes(int[][] matrix) {
     
 boolean[][] visited=new boolean[matrix.length][matrix[0].length];
        // for(boolean[] ar:visited){
        //       Arrays.fill(ar,false);
        // }
     
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j]==0 && visited[i][j]==false){
                    visited[i][j]=true;
                   solve(i,j,matrix,visited);
                }
                else if(matrix[i][j]!=0 && visited[i][j]==false){
                    visited[i][j]=true;
                }
            }
        
        }
        
    }
      public void solve(int i,int j,int[][] matrix,boolean[][] visited){
        for(int p=0;p<matrix[0].length;p++){
            if(matrix[i][p]!=0){
                matrix[i][p]=0;
                visited[i][p]=true;
            }
            
        }
        for(int k=0;k<matrix.length;k++){
             if(matrix[k][j]!=0){
                matrix[k][j]=0;
                visited[k][j]=true;
            }
        }
    } 
  
    
}

