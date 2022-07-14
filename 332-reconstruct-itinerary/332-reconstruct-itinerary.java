class Solution {
    HashMap<String,PriorityQueue<String>> map;
    public List<String> findItinerary(List<List<String>> tickets) {
//         I am making a graph
        map=new HashMap<>();
        for(List<String> t:tickets){
            String one=t.get(0);
            String two=t.get(1);
            if(map.containsKey(one)){
                map.get(one).add(two);
            }
            else{
                map.put(one,new PriorityQueue<String>());
                map.get(one).add(two);
            }
        }
        LinkedList<String> res=new LinkedList<>();
        dfs("JFK",res);
        return res;
    }
    public void dfs(String x,LinkedList<String> res){
        if(!map.containsKey(x) || map.get(x).size()==0){
            res.addFirst(x);
            return;
        }else{
            while(map.get(x).size()>0){
                String ss=map.get(x).remove();
                dfs(ss,res);
                
            }
        }
        res.addFirst(x);
    }
}