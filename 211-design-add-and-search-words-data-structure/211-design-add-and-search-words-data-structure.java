class WordDictionary {
        class Node{
            boolean eow=false;
            Node[] children=new Node[26];
        }
    Node root=new Node();
    public WordDictionary() {
        root=new Node();
    }
    
    public void addWord(String word) {
      Node node=root;
        for(char ch:word.toCharArray()){
            if(node.children[ch-'a']==null){
                node.children[ch-'a']=new Node();
                
            }
            node=node.children[ch-'a'];
        }
        node.eow=true;
    }
    
    public boolean search(String word) {
        return srch(word,0,root);
    }
    public boolean srch(String word,int idx,Node node){
        if(idx==word.length()){
            return node.eow;
        }
       char ch=word.charAt(idx);
        if(ch!='.'){
           if(node.children[ch-'a']!=null){
               return srch(word,idx+1,node.children[ch-'a']);
           }else{
               return false;
           }
            
        }else{
            for(char c='a';c<='z';c++){
                if(node.children[c-'a']!=null){
                    boolean temp=srch(word,idx+1,node.children[c-'a']);
                    if(temp) return true;
                }
            }
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */