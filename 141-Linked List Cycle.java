/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodesVisited = new HashSet<ListNode>();
        while (head != null) {
            if (nodesVisited.contains(head)) {
                return true;
            } else {
                nodesVisited.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
