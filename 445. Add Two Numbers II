// Description: https://leetcode.com/problems/add-two-numbers-ii/
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        while(l1 != null || l2 != null) {
            if(l1 != null) {
                s1.push(l1.val);
                l1 = l1.next;
            }
            if(l2 != null) {
                s2.push(l2.val);
                l2 = l2.next;
            }
        }

        ListNode head = new ListNode(0);
        int sum = 0;
        while (!s1.empty() || !s2.empty()) {
            sum += (!s1.empty() ? s1.peek() : 0) + (!s2.empty() ? s2.peek() : 0);
            head.val = sum;
            head.val %= 10;
            ListNode curr = new ListNode(sum / 10);
            curr.next = head;
            head = curr;
            if (!s1.empty()) s1.pop();
            if (!s2.empty()) s2.pop();
            sum /= 10;
        }

        return head.val == 0 ? head.next : head;
    }
}
