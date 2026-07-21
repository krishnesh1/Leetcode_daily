// Last updated: 21/07/2026, 23:13:59
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
      ListNode *slow=head;
      ListNode *fast=head;
      while(fast && fast->next){
        slow=slow->next;
        fast=fast->next->next;
        if(slow==fast){
            ListNode *temp=head;
            while(temp!=slow){
                temp=temp->next; // temp lai badhau nai parxa jaba samma equal hudai na ani matra kun position ho vanerw thah lagxa.
                slow=slow->next; // yeslai ni yesko next ma lyau nu parxa yadi 2bai same thau ma xa vane tyo node lai return gardine
            }
            return temp;
        }
      }
      return NULL;
    }
};