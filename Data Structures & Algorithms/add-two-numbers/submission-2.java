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
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        int digit1, digit2;
        int sum = 0;
        int carry = 0;

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (l1 != null || l2 != null) {
            digit1 = (l1 != null) ? l1.val : 0;
            digit2 = (l2 != null) ? l2.val : 0;

            sum = digit1 + digit2 + carry;
            carry = sum / 10;

            sum = sum % 10;
            tail.next = new ListNode(sum);
            tail = tail.next;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry != 0) {
            tail.next = new ListNode(carry);
            tail = tail.next;
        }

        return dummy.next;
    }
}
