
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null) return null;
        return merge(head);
     
    }
    ListNode merging(ListNode h1,ListNode h2){
        ListNode merged=new ListNode(-1);
        ListNode temp=merged;
        while(h1!=null && h2!=null){
            if(h1.val<h2.val){
                merged.next=h1;
                h1=h1.next;
                merged=merged.next;
            }else{
                merged.next=h2;
                h2=h2.next;
                merged=merged.next;
            }
        }
        if(h1!=null){
                merged.next=h1;
                h1=h1.next;
                merged=merged.next;
        }
     if(h2!=null){
                merged.next=h2;
                h2=h2.next;
                merged=merged.next;
        }
        return temp.next;
    }
    ListNode merge(ListNode head){
        if(head.next==null) return head;
        
        ListNode mid=findmiddle(head);
        ListNode p2=mid.next;
        mid.next=null;
        ListNode h1=merge(head);
        ListNode h2=merge(p2);
        
        ListNode finall=merging(h1,h2);
        return finall;
        
    }
    ListNode findmiddle(ListNode head){
        ListNode slow=head,fast=head.next;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
  
}
