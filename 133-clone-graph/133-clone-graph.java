/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        Node[] visited=new Node[101];
        // Arrays.fill(visited,null);
        return helper(visited,node);
    }
    public Node helper(Node[] visited,Node node){
        Node cloneTree=new Node(node.val);
        visited[node.val]=cloneTree;
        for(Node v:node.neighbors){
            if(visited[v.val]==null){
                Node val=helper(visited,v);
                    cloneTree.neighbors.add(val);
            }else{
                Node x=visited[v.val];
                cloneTree.neighbors.add(x);
            }
        }
        return cloneTree;
    }
}