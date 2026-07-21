// Last updated: 21/07/2026, 23:13:37
class Solution {
public:
    int majorityElement(vector<int>& nums) {
        map<int,int>mpp;
        for(int num:nums){
            mpp[num]++;
            if(mpp[num]>nums.size()/2){
                return num;
            }
        }
        return 0;
    }
};