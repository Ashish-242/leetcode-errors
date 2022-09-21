class Solution {
    class Node{
        boolean eow=false;
        Node[] arr=new Node[26];
    }
        Node root=new Node();
    public List<String> findWords(char[][] board, String[] words) {
//    We are storing all words in trie 
        for(String word:words){
            Node node=root;
            for(char ch:word.toCharArray()){
                if(node.arr[ch-'a']==null){
                    node.arr[ch-'a']=new Node();
                }
                node=node.arr[ch-'a'];
            }
            node.eow=true;
        }
        
//         here we implement dfs
        int n=board.length;
        int m=board[0].length;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dfs(board,i,j,vis,new StringBuilder(),root);
                
            }
        }
        return new ArrayList<>(res);
    }
    HashSet<String> res=new HashSet<>();
    int[][] dirs={{0,-1},{0,1},{-1,0},{1,0}};
    public void dfs(char[][] board,int i,int j , boolean[][] vis,StringBuilder sb,Node node){
        char ch=board[i][j];
        sb.append(ch);
   //         search in trie   
        if(node.arr[ch-'a']==null){
            sb.deleteCharAt(sb.length()-1);
            return;
        }
        Node child=node.arr[ch-'a'];
        if(child.eow){
            res.add(sb.toString());
        }
     // System.out.println(sb);
        vis[i][j]=true;

        for(int[] dir:dirs){
            int dx=dir[0]+i;
            int dy=dir[1]+j;
            if(dx>=0 && dx<board.length && dy>=0 && dy<board[0].length && vis[dx][dy]==false)
            dfs(board,dx,dy,vis,sb,child);
        }
        sb.deleteCharAt(sb.length()-1);
        vis[i][j]=false;
    }
}