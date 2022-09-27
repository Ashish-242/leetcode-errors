class Solution {
    class Node{
        boolean eow=false;
        Node[] arr=new Node[26];
    }
    boolean flag=false;
     Node root=new Node();
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
         
        for(String s:words){
            Node node=root;
            for(char ch:s.toCharArray()){
                if(node.arr[ch-'a']== null){
                    node.arr[ch-'a']=new Node();
                }
                node=node.arr[ch-'a'];
            }
            node.eow=true;
        }
        List<String> res=new ArrayList<>();
    for(String word:words){
        flag=false;
        concanate(word,0,0);
        if(flag) res.add(word);
    }
        return res;
    }
    public void concanate(String s,int j,int count){
        if(j==s.length()){
            if(count>1){
                flag=true;
              
            }
              return;
        }
        Node temp=root;
        for(int i=j;i<s.length();i++){
            char ch=s.charAt(i);
            if(temp.arr[ch-'a']== null){
                return;
            }
            temp=temp.arr[ch-'a'];
            if(temp.eow==true){
               concanate(s,i+1,count+1);
            }
        }
   
    }
}