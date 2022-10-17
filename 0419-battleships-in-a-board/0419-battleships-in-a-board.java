class Solution {
    public boolean isvalid(int i,int j,char[][] board){
        int n=board.length;
        int m=board[0].length;
        if(i>=0 && j>=0 && i<n && j<m) return true;
        return false;
    }
    public int countBattleships(char[][] board) {
        int count=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='X'){
                    
                   if(isvalid(i-1,j,board) && board[i-1][j]=='X'){
                        continue;
                    }
                 if(isvalid(i,j-1,board) && board[i][j-1]=='X'){
                        continue;
                    }
                    count++;
                }
            }
        }
        return count;
    }
}