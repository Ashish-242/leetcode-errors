class Solution {
    public List<List<Integer>> generate(int n) {
    List<List<Integer>> ans = new ArrayList<>();
        int[][] arr=new int[n][n];
        
        for(int i=0;i<n;i++){
           List<Integer> list=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    arr[i][j]=1;
                    list.add(1);
                }else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                    list.add(arr[i][j]);
                }
            }
            ans.add(list);
            
        }
        return ans;
    }
}