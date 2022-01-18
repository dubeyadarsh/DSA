// 2130. Maximum Twin Sum of a Linked List
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

// ******** Simple and naive Approach**********

// class Solution {
//     public int pairSum(ListNode head) {
//       ListNode temp=head;
//         int n=0;
      
//         while(temp!=null){
//             n++;
//             temp=temp.next;
//         }
//         // System.out.print(n);
//         temp=head;
//         int c=0;
//         Stack<Integer> stack=new Stack<>();
//          while(temp!=null){
          
//              if(c>=(n/2)) stack.add(temp.val);
//               c++;
//             temp=temp.next;
        
//          }
//         System.out.println(stack);
//         temp=head;
//         c=0;
//         int ans=0;
//         while(c<(n/2)){
//             ans=Math.max(ans,temp.val+stack.pop());
//             temp=temp.next;
//             c++;
//         }
//         return ans;
//     }
// }



// ************Optimised Approach******************
class Solution {
    ListNode reverse(ListNode head){
        ListNode prev=null,curr=head,nxt;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        head=prev;
        return head;
    }
    public int pairSum(ListNode head) {
      ListNode fast=head,slow=head ,prev=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        slow=reverse(slow);
      int sum=0;

      while(slow!=null && head!=null){
          sum=Math.max(slow.val+head.val,sum);
          // System.out.println(slow.val+" "+head.val);
          slow=slow.next;
          head=head.next;
          
      } 
        return sum;
    }
}
