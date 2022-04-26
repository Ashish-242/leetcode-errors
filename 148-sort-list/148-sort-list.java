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
    
       ListNode curr=new ListNode();

    ListNode prev=curr;
    public ListNode addFirst(List<Integer> arr){
        int i=0;
        while(i<arr.size()){
            curr.val = arr.get(i);
            if(i==arr.size()-1) break;
            curr.next=new ListNode();
            curr=curr.next;
            i++;
        }
       
        return prev;
      
        
    }
    public ListNode sortList(ListNode head) {
        if(head==null) return head; 
        List<Integer> arr = new ArrayList<Integer>();
     
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        Collections.sort(arr);
     ListNode xx=addFirst(arr);   
     
      
      
          return xx;
    }
}