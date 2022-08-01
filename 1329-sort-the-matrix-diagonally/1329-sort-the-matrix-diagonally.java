class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        HashMap<Integer,PriorityQueue<Integer>> map=new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int gap=i-j;
                if(!map.containsKey(gap)){
                    map.put(gap,new PriorityQueue<>());
                }
                map.get(gap).add(mat[i][j]);
            
        }
        }
        
//         to put values again in mat but this time in sorted order
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int gap=i-j;
                mat[i][j]=map.get(gap).remove();
            }
        }
        
        return mat;
        }
}