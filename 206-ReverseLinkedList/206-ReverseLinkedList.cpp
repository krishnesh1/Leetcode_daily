// Last updated: 21/07/2026, 23:13:28
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
 
class Solution {
public:
    ListNode* reverseList(ListNode* head) {

        if(!head || !head->next) return head;

        ListNode *newHead= reverseList(head->next);

        if(head->next){
            head->next->next=head;
        }
        head->next=NULL;
        return newHead;
      
       
    }
};