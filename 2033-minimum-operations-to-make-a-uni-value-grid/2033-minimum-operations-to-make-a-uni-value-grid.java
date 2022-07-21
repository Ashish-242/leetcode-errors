class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> list=new ArrayList<>();
          for(int i=0;i<grid.length;i++ ){
            for(int j=0;j<grid[0].length;j++){
               list.add(grid[i][j]);
            }
        }
        Collections.sort(list);
        int median=list.get(list.size()/2);
        int res=0;
        int diff=0;
        for(int val:list){
            diff=Math.abs(median-val);
            if(diff%x!=0) return -1;
            res+=diff/x;
        }
        return res;
        
            
    }
}