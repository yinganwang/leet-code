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
    public ListNode insertionSortList(ListNode head) {

//         ** Native Approach **
        if (head == null || head.next == null) return head;

        ListNode sorted_head = head;
        ListNode next = sorted_head.next;
        sorted_head.next = null;

        while (next != null) {
            ListNode curr = sorted_head;
            ListNode prev = null;
            while (curr != null && next.val >= curr.val) {
                prev = curr;
                curr = curr.next;
            }
            ListNode temp = next.next;
            // Add node in front, change head pointer to the added node
            if (prev == null) {
                next.next = sorted_head;
                sorted_head = next;
            } else { // add node in the middle or at the back of the list, insert between prev and curr
                prev.next = next;
                next.next = curr;
            }
            next = temp;
        }
        return sorted_head;
    }
}
