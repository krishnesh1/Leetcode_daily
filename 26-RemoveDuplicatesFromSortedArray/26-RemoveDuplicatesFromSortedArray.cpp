// Last updated: 21/07/2026, 23:15:25
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        
        if(nums.size() ==0) return 0 ;
        int res=1;
        for(int i=1;i<nums.size();i++){
            if(nums[i]!=nums[i-1]){
                nums[res]=nums[i];
                res++;
            }
        }
        return res;
    }
};