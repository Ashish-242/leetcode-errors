class Solution {
    class Node{
        boolean eow=false;
        Node[] arr=new Node[26];
    }
    public String replaceWords(List<String> dictionary, String sentence) {
        Node root=new Node();
        for(String s:dictionary){
            Node node=root;
            for(char ch:s.toCharArray()){
                if(node.arr[ch-'a']== null){
                    node.arr[ch-'a']=new Node();
                }
                node=node.arr[ch-'a'];
            }
            node.eow=true;
        }
    
         return helper(root,sentence);

    }
    public String helper(Node root,String sentence){
        String[] s=sentence.split(" ");
        for(int i=0;i<s.length;i++){
               Node node = root;
            String ss=s[i];
            int j=0;
            for(char c:ss.toCharArray()){
             if(node.arr[c-'a']!=null){
                 node=node.arr[c-'a'];
                  j++;
              if(node.eow==true) {
                  s[i]=ss.substring(0,j); 
                  break;
              }
             }else{
                  break; 
             }
                
            }
            
        }
        
      
     return String.join(" ",s);
    }
}