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
    public int length(ListNode root){
        if(root==null) return 0;
        int l=0;
       while(root.next!=null){
           l+=1;
           root=root.next;
       }
        return l;
    }
    public int getDecimalValue(ListNode head) {
        if(head.next==null){
            return head.val;
        }
        int len=length(head);
        int sum=0;
        while(head!=null){
            sum+=Math.pow(2,len)*head.val;
            head=head.next;
            len--;
        }
        
        return sum;
    }
}