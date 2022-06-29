class Solution {
    
 public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        PriorityQueue<Character> pq=new PriorityQueue((a,b)->  (map.get(b)) - (map.get(a)));
        StringBuilder sb=new StringBuilder();
      for(char c:s.toCharArray()){
          map.put(c,map.getOrDefault(c,0)+1);
      }
        
	pq.addAll(map.keySet());

        while(pq.size()>0){
          
            char c=pq.poll();
            for(int i=0;i<map.get(c);i++){
                sb.append(c);
            }
        }
        
        return sb.toString();
        
        
    }
}