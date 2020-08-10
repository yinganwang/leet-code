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
    public ListNode detectCycle(ListNode head) {
        ListNode curr = head;
        HashSet<ListNode> nodesSeen = new HashSet<>();
        while(curr != null) {
            if (nodesSeen.contains(curr)) {
                return curr;
            }
            nodesSeen.add(curr);
            curr = curr.next;
        }
        return null;
    }
}
