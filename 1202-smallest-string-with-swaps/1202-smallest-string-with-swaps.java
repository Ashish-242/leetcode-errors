class Solution {
//     dsu
    int[] parent;
    int[] rank;
    public int  find(int x){
        if(x==parent[x]) return x;
        parent[x]=find(parent[x]);
        return parent[x];
        
    }
    public void union(int x,int y){
        if(rank[x]>rank[y]){
            parent[y]=x;
        }else if(rank[y]>rank[x]){
            parent[x]=y;
        }else{
            parent[x]=y;
            rank[x]++;
        }
    }
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        parent=new int[s.length()];
        rank=new int[s.length()];
        for(int i=0;i<s.length();i++){
            parent[i]=i;
            rank[i]=1;
        }
        for(List<Integer> pair: pairs){
            int x=find(pair.get(0));
            int y=find(pair.get(1));
            if(x!=y){
                union(x,y);
            }
            
        }
        PriorityQueue<Character>[] pq=new PriorityQueue[s.length()];
        for(int j=0;j<s.length();j++){
            pq[j]=new PriorityQueue<>();
//             nya aise bnega
        }
        for(int i=0;i<s.length();i++){
            int li=find(i);
            char ch=s.charAt(i);
            pq[li].add(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int li=find(i);
            char chh=pq[li].remove();
            sb.append(chh);
        }
        return sb.toString();
        
    }
}