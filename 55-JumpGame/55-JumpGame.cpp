// Last updated: 21/07/2026, 23:14:52
class Solution {
public:
    bool canJump(vector<int>& nums) {
        int maxJmp=0;
        for(int i=0;i<nums.size();i++){
            if(i>maxJmp) return false;
            maxJmp=max(maxJmp,i+nums[i]);
        }
        return true;
    }
};