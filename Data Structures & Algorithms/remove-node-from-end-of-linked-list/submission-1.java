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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i=0; i<=n; i++) {   // only fast will move upto n+1 then 
            fast = fast.next;
        }

        while(fast != null ) {

            slow = slow.next;  // here slow will start and when fast will be null and outside loop
            fast = fast.next;
        }
        slow.next = slow.next.next;  // then here we are at second last node of n and will cut then next node and move to next next node

        return dummy.next;

    }
}
