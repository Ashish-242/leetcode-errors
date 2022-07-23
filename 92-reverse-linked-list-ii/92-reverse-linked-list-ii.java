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
    public ListNode reverseBetween(ListNode head, int left, int right) {
//         hum yaha 4 pointer create kr rhe h pehla pointer left wale se ekjust pehle hoga 
//         curr wala mtlb jo hmara next h 
//         forw wala jo curr ke aage h 
//         dummy hum head se pehle rkh rhe h or prev ko dummy pr kyunki agr left 1 hua to bhi hum prev ko ache se use kr ske
//         basically ye pointers ki approach h 
        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;
        dummy.next=head;
        ListNode curr=new ListNode();
        ListNode forw=new ListNode();
        for(int i=0;i<left-1;i++){
            prev=prev.next;
        }
        curr=prev.next;
        forw=curr.next;
        for(int i=0;i<right-left;i++){
            curr.next=forw.next;
            forw.next=prev.next;
            prev.next=forw;
            forw=curr.next;
        }
        return dummy.next;
    }
}