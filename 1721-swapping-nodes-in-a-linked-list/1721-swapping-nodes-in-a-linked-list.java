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
     ListNode first=null;
        ListNode second=null;
    public int length(ListNode head){
        if(head==null) return 0;
        int l=1;
        while(head.next!=null){
            head=head.next;
            l++;
        }
        return l;
    }
    public void swap(ListNode head,ListNode tail){
        ListNode temp=new ListNode();
        temp.val=head.val;
        head.val=tail.val;
        tail.val=temp.val;
    }
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null) return null;
        if(head.next==null) return head;
        int len=length(head);
        if(len==k){
            ListNode xs=head;
            first=xs;
            int z=1;
            while(z!=k){
            xs=xs.next;
                z++;
            }
            second=xs;
            swap(first,second);
            return head;
        }
        int i=1;
       int j=1;
        int y=len-k+1;
        
        ListNode x=head;
        ListNode p=head;
        while(i!=k){
            i++;
            x=x.next;
        }
        first=x;
        while(j!=y){
            j++;
            p=p.next;
        }
        second=p;
        swap(first,second);
//         while(x.next!=null){
//             if(i==k){
//                  first=x;
//             }
//              if(j==y){
//                  second=x;
//                 swap(first,second);
//             }
           
//             x=x.next;
//              i++;
//             j++;
//         }
        return head;
    }
}