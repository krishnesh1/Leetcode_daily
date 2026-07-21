// Last updated: 21/07/2026, 23:13:51
class Solution {
    public void reorderList(ListNode head) {

        if (head == null) return;

        List<ListNode> list = new ArrayList<>();

        // Step 1: store nodes
        ListNode temp = head;
        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }

        // Step 2: reorder
        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
            list.get(i).next = list.get(j);
            i++;

            if (i == j) break;

            list.get(j).next = list.get(i);
            j--;
        }

        // last node should point to null
        list.get(i).next = null;
    }
}