class Solution {
    HashMap<String,PriorityQueue<String>> adj;
    public List<String> findItinerary(List<List<String>> tickets) {
        adj=new HashMap<>();
//         we made a graph by this process
        for(List<String> l:tickets){
            String one=l.get(0);
            String two=l.get(1);
            if(adj.containsKey(one)){
                 adj.get(one).add(two);
            }else{
                adj.put(one,new PriorityQueue<>());
                adj.get(one).add(two);
            }
        }
        LinkedList<String> res=new LinkedList<>();
        dfs("JFK",res);
        return res;
        
    }
    public void dfs(String v,LinkedList<String> res){
        if(adj.containsKey(v)==false || adj.get(v).size()==0){
            res.addFirst(v);
            return;
        }
        while(adj.get(v).size()>0){
            String ss=adj.get(v).remove();
            dfs(ss,res);
        }
        res.addFirst(v);
    }
}