/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        if(head==null) return null;
          List<Integer> arr=new ArrayList<>();
       
        Stack<Integer> st=new Stack<Integer>();
      while(head!=null){
          arr.add(head.val);
          head=head.next;
      }
  int[] arr2=new int[arr.size()];
      
        for(int i=arr.size()-1;i>=0;i--){
           
         
            
            while(!st.empty()  && arr.get(i) >=st.peek()){
                st.pop();
            }
           
              if(st.size()==0){
                arr2[i]=0;
                st.push(arr.get(i));
            } 
        else if(arr.get(i) < st.peek()){
                arr2[i]=st.peek();
                st.push(arr.get(i));
            }else {
            st.push(arr.get(i));
                arr2[i]=0;
            }
           
        }
        return arr2;
    }
}