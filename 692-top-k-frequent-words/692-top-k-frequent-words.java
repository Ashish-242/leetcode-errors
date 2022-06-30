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
        PriorityQueue<String>pq=new PriorityQueue<>(new Comparator<String>(){
            public int compare(String a,String b){
                if(map.get(b)-map.get(a)==0){
                  int x=Math.min(a.length(),b.length());
                    int i=0;
                    while(i!=x){
                        char aa=a.charAt(i);
                        char bb=b.charAt(i);
                        if(aa!=bb){
                            return (aa+'a')-(bb+'a');
                        }
                        i++;
                    }
                    if(i==x){
                   return a.length()-b.length();
                       
                    }
                }
                return map.get(b)-map.get(a);
            }
        });
        
        for(String key:map.keySet()){
            pq.add(key);
         
        }
        while(k!=0){
            ans.add(pq.poll());
            k--;
        }
        return ans;
    }
}