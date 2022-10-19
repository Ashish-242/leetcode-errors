class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0) && solve(i,j,n,m,board,word,0,visited) ){
                    return true;
                }
            }
        }
        return false;
        
    }
    public boolean solve(int si,int ei,int n ,int m,char[][] board,String s,int k,boolean[][] vis){
        if(k==s.length()){
            return true;
        }
        if(si<0 || ei<0 || si>=n || ei>=m || vis[si][ei]==true || s.charAt(k)!=board[si][ei] ){
            return false;
        }
        vis[si][ei]=true;
      
        boolean a= solve(si+1,ei,n,m,board,s,k+1,vis) ||  solve(si-1,ei,n,m,board,s,k+1,vis)
          || solve(si,ei+1,n,m,board,s,k+1,vis) || solve(si,ei-1,n,m,board,s,k+1,vis);
            vis[si][ei]=false;
        return a;
    }
}