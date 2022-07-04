class Solution {
    public int[] findRedundantDirectedConnection(int[][] edges) {
  
      int n=edges.length;
    int[] indegree=new int[n+1];
    Arrays.fill(indegree,-1);
    int bl1=-1;
    int bl2=-1;
    for(int i=0;i<edges.length;i++){
        int u=edges[i][0];
        int v=edges[i][1];
        if(indegree[v]==-1){
            indegree[v]=i;
        }else{
            // mtlb ehle se hi uska parent h 
            bl1=i;
            bl2=indegree[v];
        }
    }
    parent=new int[n+1];
    rank=new int[n+1];
    for(int i=0;i<edges.length;i++){
        parent[i]=i;
        rank[i]=-1;
    }
    
     for(int i=0;i<edges.length;i++){
         if(i==bl1) continue;
        int u=edges[i][0];
        int v=edges[i][1];
      boolean  flag= union(u,v);
      if(flag==true){
          if(bl1==-1){
              return edges[i];
            //   case 2
          }
          return edges[bl2];
        //   case 3
      }
    }
    return edges[bl1]; 
    // case 1
  }
  static int[] parent;
    static int[] rank;
    public  boolean union(int x, int y){
        int s1l=find(parent,x);
        int s2l=find(parent,y);
        if(s1l!=s2l){
            if(rank[s1l] < rank[s2l]){
           parent[s1l] = s2l;
       } else if(rank[s2l] < rank[s1l]){
           parent[s2l] = s1l;
       } else {
           parent[s1l] = s2l;
           rank[s2l]++;
       }
       return false;
        }else {
            // agr donok aprent same h to cycle h yaha pr 
            return true;
        }
       
   }
  public  int find(int[] parent, int f) {
  if(parent[f]==f) return f;
  parent[f]=find(parent,parent[f]);
  return parent[f];
  }
    }
