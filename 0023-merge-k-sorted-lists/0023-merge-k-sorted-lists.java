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
    ListNode merge2LL(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;

        if(l1.val <= l2.val) {
            l1.next = merge2LL(l1.next, l2);
            return l1;
        } else {
            l2.next = merge2LL(l1, l2.next);
            return l2;
        }
    }

    ListNode partition(int start, int end, ListNode[] lists) {
        if(start>end) return null;
        if(start == end) return lists[start];

        int mid = start + (end-start)/2;
        ListNode l1 = partition(start, mid, lists);
        ListNode l2 = partition(mid+1, end, lists);

        return merge2LL(l1, l2);
    }

    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if(n==0) return null;

        return partition(0, n-1, lists);
    }
}