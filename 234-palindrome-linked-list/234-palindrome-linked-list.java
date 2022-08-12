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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow=head,fast=head,temp=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode aftermid=reverse(slow.next);
        slow.next=null;
        ListNode nhead=aftermid;
        boolean flag=true;
        
        while(nhead!=null ){
            if(nhead.val!=temp.val) {
                flag=false;
                break;
            }
            nhead=nhead.next;
            temp=temp.next;
        }
        ListNode midnext=reverse(aftermid);
        slow.next=midnext;
        
        
        return flag;
    }
}