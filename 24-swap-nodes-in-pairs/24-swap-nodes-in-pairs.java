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
    ListNode th=null;
    ListNode tt=null;
    
     public int length(ListNode head){
      
        if(head==null) return 0;
          int l=0;
        ListNode c=head;
       while(c!=null){
           c=c.next;
           l++;
       }
        return l;
    }
    public void addFirst(ListNode t){
        if(th==null) th=tt=t;
        
        else{
            t.next=th;
            th=t;
        }
    }
    public ListNode swapPairs(ListNode head) {
        int k=2;
        
         if((head==null) || (head.next==null) || (k == 1)) return head;
        
        int len=length(head);
        ListNode curr=head, ah=null, at=null;
      
       
        while(len>=k){
            
         int temp=k;
            
        while(temp-->0){
         
              ListNode frwd=curr.next;
         
            curr.next=null;
            addFirst(curr);
            curr=frwd;
        }
        if(ah==null ){
            ah=th;
            at=tt;
        }else{
            at.next=th;
            at=tt;
        }
            th=tt=null;
            len-=k;
    }
        at.next=curr;
        return ah;
    }
}



 
    
   
    
     