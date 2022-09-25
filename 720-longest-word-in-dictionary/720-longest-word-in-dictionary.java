class Solution {
class Node{
        boolean eow=false;
        Node[] arr=new Node[26];
    }

String res="";

    public String longestWord(String[] words) {
            Node root=new Node();
        for(String word:words){
            Node node=root;
            for(char ch:word.toCharArray()){
                if(node.arr[ch-'a']==null){
                    node.arr[ch-'a']=new Node();
                   
                }
                 node=node.arr[ch-'a'];
            }
            node.eow=true;
        }
        
     
    helper(root,new StringBuilder());
        return res;
    }
    public void helper(Node node, StringBuilder sb){
        if(sb.length() > res.length()){
            res=sb.toString();
        }
        for(char ch='a';ch<='z';ch++){
            Node child=node.arr[ch-'a'];
            if(child!=null && child.eow == true){
                sb.append(ch);
                helper(child,sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }

}