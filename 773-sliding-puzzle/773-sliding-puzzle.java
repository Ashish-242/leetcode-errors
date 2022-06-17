class Solution {
    public int slidingPuzzle(int[][] board) {
            String initial="";
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            sb.append(board[i][j]);
        }
    }
    initial=sb.toString();
    
    String result="123450";
    int[][] arr2={{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{4,2}};
    
    ArrayDeque<String> queue=new ArrayDeque<>();
    queue.add(initial);
    
    int level=0;
    HashSet<String> set=new HashSet<>();
    while(queue.size()>0){
        int size=queue.size();
        while(size-->0){
            String rem=queue.remove();
            if(rem.equals(result)){
                return level;
                
            }
            int id=-1;
            for(int i=0;i<rem.length();i++){
                if(rem.charAt(i)=='0'){
                    id=i;
                    break;
                }
            }
            int[] a=arr2[id];
            for(int j=0;j<a.length;j++){
                String res=swap(rem,a[j],id,a);
                if(!set.contains(res)){
                     queue.add(res);
                }
                set.add(res);
               
            }
        }
        level++;
    }
    return -1;
    
  }
  public static String swap(String rem, int first,int second,int[] a){
      StringBuilder sb=new StringBuilder(rem);
      sb.setCharAt(first,rem.charAt(second));
      sb.setCharAt(second,rem.charAt(first));
      
      return sb.toString();
      
  }
   
}