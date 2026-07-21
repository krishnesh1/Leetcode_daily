// Last updated: 21/07/2026, 23:13:09
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
 ListNode *reverse(ListNode *head){
    ListNode *temp=NULL;
    ListNode *prev=NULL;
    ListNode *curr=head;
    while(curr){
        temp=curr->next;
        curr->next=prev;
        prev=curr;
        curr=temp;
    }
    head=prev;
    return head;
 }
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        ListNode *slow=head;
        ListNode *fast=head;
        while(fast && fast->next){
            slow=slow->next;
            fast=fast->next->next;
        }
        ListNode *second=reverse(slow);
        ListNode *first=head;
        while(second){
            if(first->val!=second->val) return 0;
            second=second->next;
            first=first->next;
        }
        return 1;
    }
};