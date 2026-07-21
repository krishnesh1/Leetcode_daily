// Last updated: 21/07/2026, 23:14:49
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
    ListNode* rotateRight(ListNode* head, int k) {
       if(!head || !head->next || k==0) return head;

      ListNode *temp=head;
      int cnt=1;
      while(temp->next){
        cnt++;
        temp=temp->next;
      }
      k=k%cnt;
      if(k==0) return head;
      temp->next=head;
      int pos=cnt-k;
      ListNode *curr=head;
      for(int i=1;i<pos;i++){
        curr=curr->next;
      }
      head=curr->next;
      curr->next=NULL;
      return head;
    }
};