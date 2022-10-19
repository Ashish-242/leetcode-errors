class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        if(words.length==0 || k==0) {
            List<String> res=new ArrayList<>();
            return res;
        } 
        HashMap<String,Integer> map=new HashMap<>();
        List<String> ans=new ArrayList<>();
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
            
        }
        PriorityQueue<String> pq=new PriorityQueue<>(new Comparator<String>(){
            public int compare(String a,String b){
                if(map.get(a)==map.get(b)){
                    return a.compareTo(b);
                }
                return map.get(b)-map.get(a);
            }
        });
            for(String kk:map.keySet()){
                pq.add(kk);
            }
       while(k-- > 0){
           ans.add(pq.poll());
       }
        return ans;
    }
}