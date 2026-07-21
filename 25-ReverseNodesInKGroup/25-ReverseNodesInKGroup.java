// Last updated: 21/07/2026, 23:15:20
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
    public ListNode reverseKGroup(ListNode head, int k) {


        ListNode temp = head;
        int cnt =0;
        while(temp!=null && cnt < k){
            temp = temp.next;
            cnt++;
        }

        if(cnt<k) return head;

        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;
        cnt =0;

        while(curr!=null && cnt < k){

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            cnt++;
        }

        head.next = reverseKGroup(curr,k);

        return prev;
    
        
    }
}