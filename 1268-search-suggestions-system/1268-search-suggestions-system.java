class Solution {
    class Node{
        boolean eow=false;
        Node arr[];
        List<String> r;
        Node(){
            arr=new Node[26];
            r=new ArrayList<>();
        }
    }
    Node root=new Node();
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
//         for sorted order
            for(String word:products){
            Node node=root;
            for(char ch:word.toCharArray()){
                if(node.arr[ch-'a']==null){
                    node.arr[ch-'a']=new Node();
                }
                node=node.arr[ch-'a'];
                if(node.r.size()<3){
                    node.r.add(word);
                }
            }
            node.eow=true;
        }
        List<List<String>> res=new ArrayList<>();
        Node n=root;
        for(int j=0;j<searchWord.length();j++){
            char ch=searchWord.charAt(j);
            n=n.arr[ch-'a'];
            if(n==null){
                for(int i=j;i<searchWord.length();i++){
                      res.add(Collections.EMPTY_LIST);
                }
               
                break;
            }
            res.add(n.r);
        }
        return res;
    }
}