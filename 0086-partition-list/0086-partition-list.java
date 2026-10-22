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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = dummy;

        // Find the end of the initial < x prefix
        while (temp.next != null && temp.next.val < x) {
            temp = temp.next;
        }

        ListNode prev = temp;
        ListNode curr = temp.next;

        while (curr != null) {
            if (curr.val < x) {
                ListNode nextNode = curr.next;

                // Detach curr
                prev.next = nextNode;

                // Insert curr after temp
                curr.next = temp.next;
                temp.next = curr;

                // Update partition boundary
                temp = curr;
                curr = nextNode;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}
