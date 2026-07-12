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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return list1;
        }

        ListNode dummy = new ListNode(0);
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode dummytail = dummy;

        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                dummytail.next = new ListNode(temp1.val);
                dummytail = dummytail.next;
                temp1 = temp1.next;

            } else {
                dummytail.next = new ListNode(temp2.val);
                dummytail = dummytail.next;
                temp2 = temp2.next;
            }
        }

        while (temp1 != null) {
            dummytail.next = new ListNode(temp1.val);
            dummytail = dummytail.next;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            dummytail.next = new ListNode(temp2.val);
            dummytail = dummytail.next;
            temp2 = temp2.next;
        }

        return dummy.next;
    }
}