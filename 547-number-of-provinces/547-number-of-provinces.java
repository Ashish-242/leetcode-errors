class Solution {
    public int findCircleNum(int[][] is) {
        int n=is.length;
        boolean[] visited=new boolean[n];
        int result=0;
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                dfs(i,visited,is);
                result++;
            }
        }
        return result;
    }
    public void dfs(int i,boolean[] vis,int[][] is){
        vis[i]=true;
        for(int j=0;j<vis.length;j++){
            if(i!=j && (is[i][j]==1 && vis[j]==false)){
                dfs(j,vis,is);
            }
        }
    }
}