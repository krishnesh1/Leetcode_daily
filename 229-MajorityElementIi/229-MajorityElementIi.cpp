// Last updated: 21/07/2026, 23:13:15
class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        vector<int>v;
        map<int,int>mpp;
        for(int i:nums){
            mpp[i]++;
        }
        for(auto it:mpp){
            if(it.second>nums.size()/3){
                v.push_back(it.first);
            }
        }
        return v;
    }
};