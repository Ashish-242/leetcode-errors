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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode prev=null;
       for(int i=0;i<lists.length;i++){
          ListNode f=lists[i];
           prev=mergelist(prev,f);
       } 
        return prev;
    }
    public ListNode mergelist(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
         ListNode one=l1,two=l2;
        ListNode dummy=new ListNode(-1);
        ListNode p=dummy;
        while(one!=null && two!=null){
            if(one.val>two.val){
               p.next=two;
               two=two.next;
            }else{
               p.next=one;
               one=one.next;
            }
            p=p.next;
        }
        while(true){
            if(one==null && two==null) break;
            else if(one!=null){
                p.next=one;
                one=one.next;
                p=p.next;
            }else{
                  p.next=two;
                two=two.next;
                p=p.next;
            }
        }
        return dummy.next;
        
    }
}