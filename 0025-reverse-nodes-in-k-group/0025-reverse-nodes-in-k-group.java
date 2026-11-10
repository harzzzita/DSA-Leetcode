
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
         ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupTail = dummy;
        while (true) {
            ListNode kth = prevGroupTail;
            for (int i = 0; i < k; i++) {
                kth = kth.next;

                if (kth == null) {
                    return dummy.next;
                }
            }
            ListNode nextGroup = kth.next;

            ListNode prev = nextGroup;
            ListNode curr = prevGroupTail.next;
            while (curr != nextGroup) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            ListNode temp = prevGroupTail.next;
            prevGroupTail.next = kth;
            prevGroupTail = temp;
        }
    }
}
