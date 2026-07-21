// Last updated: 21/07/2026, 23:13:46
class Solution {

    public ListNode sortList(ListNode head){
        if(head == null || head.next == null)
            return head;

        ListNode mid = getMid(head);
        ListNode right = mid.next;
        mid.next = null;

        ListNode leftSorted = sortList(head);
        ListNode rightSorted = sortList(right);

        return merge(leftSorted, rightSorted);
    }

    // Find middle
    ListNode getMid(ListNode head){
        ListNode slow = head, fast = head.next;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted lists
    ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(a != null && b != null){
            if(a.val < b.val){
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        if(a != null) tail.next = a;
        if(b != null) tail.next = b;

        return dummy.next;
    }
}
