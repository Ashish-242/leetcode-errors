class MapSum {
  
    class Node{
        int eow=0;
        Node[] children=new Node[26];
    }
    Node root=new Node();
    
    public MapSum() {
        root=new Node();
    }
    
    public void insert(String key, int val) {
        Node node=root;
        for(char ch:key.toCharArray()){
            if(node.children[ch-'a']==null){
                node.children[ch-'a']=new Node();
                
            }
            node=node.children[ch-'a'];
        }
        node.eow=val;
        
    }
    int sum;
    public int sum(String prefix) {
        Node node=root;
        for(char ch:prefix.toCharArray()){
            if(node.children[ch-'a']==null){
                return 0;
            }
            node=node.children[ch-'a'];
        }
      sum=0;
        helper(node);
        return sum;
        
    }
    public void helper(Node node){
        sum+=node.eow;
        for(Node child:node.children){
            if(child!=null){
                helper(child);
            }
        }
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */