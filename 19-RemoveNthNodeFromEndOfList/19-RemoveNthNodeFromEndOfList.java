// Last updated: 21/07/2026, 23:15:30
/**
 * Definition for singly-linked list.
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int cnt = 0;

        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        int pos = cnt - n;

        // Case: if cnt ==5 && n==5 then pos=0 so to remove head we should do first point to next and then remove the node 
        if (pos == 0) {
            return head.next;
        }

        ListNode prev = head;

        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;
        prev.next = curr.next;

        return head;
    }
}
