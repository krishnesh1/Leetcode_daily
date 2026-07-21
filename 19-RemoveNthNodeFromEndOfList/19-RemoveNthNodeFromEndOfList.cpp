// Last updated: 21/07/2026, 23:15:38
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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode *temp=head;
        int cnt=0;
        while(temp){
            cnt++;
            temp=temp->next;
        }
      int pos=cnt-n;
      // case for when cnt==5 and n==5 then it should remove last node but removing 0th node so to handle head case.
      if (pos == 0) {  
        ListNode* newHead = head->next;  
        delete head;  
        return newHead;  
        }

      ListNode *prev=head;
      ListNode *curr=NULL;
      for(int i=0;i<pos-1;i++){
        prev=prev->next;
      }
      
        curr=prev->next;
      prev->next=curr->next;
      delete curr;
      return head;

    }
};