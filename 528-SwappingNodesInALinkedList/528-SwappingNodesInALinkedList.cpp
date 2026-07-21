// Last updated: 21/07/2026, 23:12:23
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
    ListNode* swapNodes(ListNode* head, int k) {
        
        ListNode *left=head;
        ListNode *right=head;
        ListNode *temp=head;
        int cnt=1;
        while(temp){
            if(k<cnt){
                left=left->next;
            }
            if(k>cnt){
                right=right->next;
            }
            temp=temp->next;
            cnt++;
        }
        int rev=right->val;
        right->val=left->val;
        left->val=rev;
        return head;
    }
};