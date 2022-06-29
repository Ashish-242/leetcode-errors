class Solution {
    public class Pair implements Comparator<Pair>{
        char c;
        int n;
        Pair(char c,int n){
            this.c=c;
            this.n=n;
        }
        Pair(){
            
        }
        public int compare(Pair a,Pair b){
            if(b.n-a.n==0){
                return ((b.c+'a')- (a.c+'a'));
            }
            
            return b.n-a.n;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>(new Pair());
        StringBuilder sb=new StringBuilder();
      for(char c:s.toCharArray()){
          map.put(c,map.getOrDefault(c,0)+1);
      }
        for(char key:map.keySet()){
            pq.add(new Pair(key,map.get(key)));
        }
        while(pq.size()>0){
             Pair rem=pq.remove();
            for(int i=0;i<rem.n;i++){
                sb.append(rem.c);
            }
        }
        
        return sb.toString();
        
        
    }
}