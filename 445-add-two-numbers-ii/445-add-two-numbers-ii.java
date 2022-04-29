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
    public ListNode reverse(ListNode curr){
        ListNode x=new ListNode();
        ListNode prev=null;
        while(curr!=null){
            x=curr.next;
            curr.next=prev;
            prev=curr;
            curr=x;
        }
        return prev;
    }
    public ListNode add(ListNode head, ListNode tail){
        ListNode s=new ListNode(-1);
        ListNode val=new ListNode();
        ListNode xx=s;
        int c=0;
        while(head!=null && tail!=null){
            int x=head.val+tail.val +c;
              
            c = x/10;
           
            ListNode temp=new ListNode(x%10);
            s.next=temp;
            s=s.next;
            head=head.next;
            tail=tail.next;
        }
        while(head!=null && tail==null){
            int x=head.val +c;
          
            head=head.next;
            s.next=new ListNode(x%10);
            s = s.next;
            c = x/10;
            
            
        }
          while(head==null && tail!=null){
            int x=tail.val +c;
            tail=tail.next;
            s.next=new ListNode(x%10);
              c = x/10;
              
              s=s.next;
        }
        if(c!=0)s.next = new ListNode(c); s = s.next;
        return xx.next;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         
        ListNode head=reverse(l1);
        ListNode tail=reverse(l2);
        
        ListNode result=add(head,tail);
        ListNode ans=reverse(result);
        return ans;
    }
}