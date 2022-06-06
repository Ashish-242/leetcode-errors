/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return null;
        if(root.left==null && root.right==null) return root;
     Queue<Node> qt=new LinkedList<>();
        Node temp=root;
        qt.add(temp);
             Node x=null;
        while(qt.size()!=0){
            int size=qt.size();
            int i=1;
       
            while(size!=0){
         
                 Node node=qt.peek();
                qt.remove();
                if(i==1){
                     x=node;
                }else{
                    x.next=node;
                    x=x.next;
                }
              
                if(node.left!=null)qt.add(node.left);
                 if(node.right!=null)qt.add(node.right);
                i++;
                size--;
            }
        }
        return temp;
    }
}