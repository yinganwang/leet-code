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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        int interval = 1;
        while (interval < lists.length) {
            for (int i = 0; i + interval < lists.length; i += interval*2) {
                lists[i] = mergeTwoLists(lists[i], lists[i + interval]);
            }
            interval *= 2;
        }
        return lists[0];
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode handler = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                handler.next = l1;
                l1 = l1.next;
            } else {
                handler.next = l2;
                l2 = l2.next;
            }
            handler = handler.next;
        }
        if (l1 != null) handler.next = l1;
        if (l2 != null) handler.next = l2;
        return head.next;
    }
}
