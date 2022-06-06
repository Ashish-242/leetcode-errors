
public class Solution {
   
    public int length(ListNode curr){
        if(curr==null) return 0;
        int l=0;
       while(curr!=null){
           curr=curr.next;
           l++;
       }
        return l;
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        // if(headA.next==null && headB.next==null && headA.val==headB.val){
        //     return headA;
        // }else if(headA.next==null && headB.next==null && headA.val!=headB.val){
        //     return null;
        // }
        
        int len1=length(headA);
        int len2=length(headB);
        
        int len=Math.abs(len1-len2);
        
        if(len1 <= len2){
         
            int y=0;
            while(y!=len){
                headB=headB.next;
                y++;
            }
        }
        
        if(len1 > len2){
       
            int y=0;
            while(y!=len){
                headA=headA.next;
                y++;
            }
         }
            while(headA.next != headB.next){
                headA=headA.next;
                headB=headB.next;
            }
            // if(headA==temp) return headA;
            // else return headA.next;
           
        
         
            // if(headB==temp) return headB;
            // else return headB.next;
            if(headA==headB) return headA;
        else if(headA.next==headB.next) return headA.next;
        else return null;
        
        
    }
}