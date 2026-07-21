// Last updated: 21/07/2026, 23:12:31
class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int cnt=0;
        int maxcnt=0;
       for(int i=0;i<nums.size();i++){
        if(nums[i]==1){
            cnt++;
        }else{
            if(cnt>maxcnt){
                maxcnt=cnt;
            }
            cnt=0;
        }
        // this is for final check kina vane yadi if nai thik xa vane else ma compare hudai na 
        // so last ma ni check garnu parxa last wala thulo xa ki k
        if(cnt>maxcnt){
            maxcnt =cnt;
        }
       
       }
        return maxcnt;
    }
};