class Solution {
    int[] parent;
    int[] rank;
    public int find(int x){
        if(parent[x]==x) return x;
        parent[x]=find(parent[x]);
        return parent[x];
    }
    public void union(int x,int y){
        if(rank[x]>rank[y]){
            parent[y]=x;
        }else if(rank[y]>rank[x]){
            parent[x]=y;
        }else{
            parent[y]=x;
            rank[x]++;
        }
    }
 
    public int findCircleNum(int[][] is) {
        int n=is.length;
         parent=new int[n];
        rank=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            rank[i]=0;
        }
        int ans=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(is[i][j]==1 && i!=j){
                    int x=find(i);
                    int y=find(j);
                    if(x!=y){
                        union(x,y);
                        ans--;
                    }
                }
            }
        }
        return ans;
       
        
    }
}