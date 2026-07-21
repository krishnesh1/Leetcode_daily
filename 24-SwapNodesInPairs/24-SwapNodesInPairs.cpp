// Last updated: 21/07/2026, 23:15:22
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
    ListNode* swapPairs(ListNode* head) {
        ListNode *dummyHead=new ListNode(0);
        dummyHead->next=head;
        ListNode *prev=dummyHead;

        while(prev->next && prev->next->next){

            ListNode *first=prev->next;
            ListNode *second=first->next;

            first->next=second->next;
            second->next=first;
            prev->next=second;

            prev=first;

        }
        return dummyHead->next;
    }
};