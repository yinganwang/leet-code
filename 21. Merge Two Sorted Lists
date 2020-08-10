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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Recursive, O(n) time, O(n) space
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode handler;
        if (l1.val <= l2.val) {
            handler = l1;
            handler.next = mergeTwoLists(l1.next, l2);
        } else {
            handler = l2;
            handler.next = mergeTwoLists(l1, l2.next);
        }
        return handler;
        // Iterative, O(n) time, O(1) space
        // ListNode head = new ListNode(0);
        // ListNode curr = head;
        // while(l1 != null && l2 != null) {
        //     if (l1.val <= l2.val) {
        //         curr.next = l1;
        //         l1 = l1.next;
        //     } else {
        //         curr.next = l2;
        //         l2 = l2.next;
        //     }
        //     curr = curr.next;
        // }
        // if (l1 != null) {
        //     curr.next = l1;
        // }
        // if (l2 != null) {
        //     curr.next = l2;
        // }
        // return head.next;
    }
}
