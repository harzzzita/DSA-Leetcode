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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev1 = null , curr1 = l1 ;
        while(curr1 != null){
            ListNode front1 = curr1.next ;
            curr1.next = prev1 ;
            prev1 = curr1 ;
            curr1 = front1 ;
        }
        ListNode prev2 = null , curr2 = l2 ;
        while(curr2 != null){
            ListNode front2 = curr2.next ;
            curr2.next = prev2 ;
            prev2 = curr2 ;
            curr2 = front2 ;
        }
        int sum = 0 , carry = 0 ;
        ListNode dummy = new ListNode(0) ;
        ListNode curr = dummy ;
        while(prev1 != null || prev2 != null || carry != 0){
            sum = carry ;

            if(prev1 != null){
                sum += prev1.val ;
                prev1 = prev1.next ;
            }
            if(prev2 != null){
                sum += prev2.val ;
                prev2 = prev2.next ;
            }
            int num = sum%10 ;
            carry = sum/10 ;
            curr.next = new ListNode(num) ;
            curr = curr.next ;
        }
        curr = dummy.next ;
        ListNode prev = null ;
        while(curr != null){
            ListNode front = curr.next ;
           curr.next = prev ;
           prev = curr ;
           curr = front;
        }
        return prev ;

    }
}