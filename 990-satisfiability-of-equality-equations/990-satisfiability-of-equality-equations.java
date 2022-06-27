class Solution {
     int[] parent=new int[26];
    int[] rank=new int[26];
    public boolean equationsPossible(String[] equations) {
       
        for(int i=0;i<26;i++){
            parent[i]=i;
            rank[i]=0;
        }
        
      
          for(String e:equations){
              
              if(e.charAt(1)=='='){
            int lead1=e.charAt(0)-'a';
            int lead2=e.charAt(3)-'a';
            int l1=find(lead1);
            int l2=find(lead2);
            if(l1!=l2){
                union(l1,l2);
            }
              }
          }
        for(String e:equations){
            if(e.charAt(1)=='!'){
            int lead1=e.charAt(0)-'a';
            int lead2=e.charAt(3)-'a';
            int l1=find(lead1);
            int l2=find(lead2);
            if(l1==l2){
               return false;
            }
              }
        }     
        
        
          
      return true;  
      
    }
   
    
    public int find(int x){
        if(parent[x]==x) {
            return x;
        }
       else {
            int ans=find(parent[x]);
              return ans;
       }
       
     
            
    }
    
    public void union(int x1,int x2){
        if(rank[x1]< rank[x2]){
            parent[x1]=x2;
        }else if(rank[x1]> rank[x2]){
            parent[x2]=x1;
        }else{
            rank[x2]++;
            parent[x1]=x2;
        }
    }
        
}