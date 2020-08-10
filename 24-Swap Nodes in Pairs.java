// https://leetcode.com/problems/swap-nodes-in-pairs/
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
    public ListNode swapPairs(ListNode head) {
        ListNode curr = head;
        head = null;
        ListNode prev_curr = null;
        while(curr != null) {
            if (curr.next != null) {
                ListNode next = curr.next;
                curr.next = next.next;
                next.next = curr;
                if (prev_curr != null) {
                    prev_curr.next = next;
                }
                if (head == null) {
                    head = next;
                }
            }
            prev_curr = curr;
            if (head == null) {
                head = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}
