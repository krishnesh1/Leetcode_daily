// Last updated: 21/07/2026, 23:14:03
class Solution {
public:
    int singleNumber(vector<int>& nums) {
       map<int,int>mpp;
       for(int i=0;i<nums.size();i++){
            mpp[nums[i]]++;
       }
       for(auto it:mpp){
            if(it.second==1){
                return it.first;
            }
       }
       return 0;
    }
};