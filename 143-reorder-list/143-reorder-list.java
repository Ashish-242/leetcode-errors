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
     public  ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode right=null;
        while(curr!=null){
            right=curr.next;
            curr.next=prev;
            prev=curr;
            curr=right;
        }
        
        return prev;
    }
    public  ListNode midvalue(ListNode head){
        if(head==null || head.next==null) return head;
         ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        
        ListNode mid=midvalue(head);
        ListNode midnext=mid.next;
        mid.next=null;
         midnext=reverse(midnext);
        ListNode f1=head;
        ListNode f2=midnext;
        ListNode c1=null;
        ListNode c2=null;
        while( f2!=null){
            c1=f1.next;
            c2=f2.next;
            f1.next=f2;
            f2.next=c1;
            f1=c1;
            f2=c2;
        }
      
        
    }
     void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

}