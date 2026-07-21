// Last updated: 21/07/2026, 23:15:48
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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        
        ListNode *dummyHead=new ListNode(0);
        ListNode *head=dummyHead;
        int carry=0;
        while(l1!=NULL || l2!=NULL || carry){
            int x=(l1==NULL) ? 0 : l1->val;
            int y=(l2==NULL) ? 0 : l2->val;
            int sum=x+y+carry;
            carry=sum/10;
            head->next=new ListNode(sum%10);
            head=head->next;

            if(l1) l1=l1->next;
            if(l2) l2=l2->next;
        }
        return dummyHead->next;
    }
};