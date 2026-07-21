// Last updated: 21/07/2026, 23:13:04
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        
        int pro=1;
        int zeroCnt=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]!=0){
            pro=pro*nums[i];
            }
            else{
                zeroCnt++;
            }
        }
        for(int i=0;i<nums.size();i++){
            if(zeroCnt > 1){
                nums[i]=0;
            }
            else if(zeroCnt==1){
              if(nums[i]==0){
                nums[i]=pro;
              }else{
                nums[i]=0;
              }
            }
            else{
                nums[i]=pro/nums[i];
            }

        }
        return nums;
    }
};