class Solution {
    static int[] parent;
  static int[] rank;
  public  int[] findRedundantConnection(int[][] edges) {
      
        rank=new int[edges.length+1];
        parent=new int[edges.length+1];
        for(int i=1;i<parent.length;i++){
            parent[i]=i;
            rank[i]=0;
        }
        for(int[] arr:edges){
            int x=find(parent,arr[0]);
            int y=find(parent,arr[1]);
            if(x!=y){
                union(x,y);
            }else {
                return arr;
            }
            
        }
       return new int[2];
        
  }
  public  void union(int s1l, int s2l){
       if(rank[s1l] < rank[s2l]){
           parent[s1l] = s2l;
       } else if(rank[s2l] < rank[s1l]){
           parent[s2l] = s1l;
       } else {
           parent[s1l] = s2l;
           rank[s2l]++;
       }
   }
  private  int find(int[] parent, int f) {
  if(parent[f]==f) return f;
  parent[f]=find(parent,parent[f]);
  return parent[f];
  }
}
 