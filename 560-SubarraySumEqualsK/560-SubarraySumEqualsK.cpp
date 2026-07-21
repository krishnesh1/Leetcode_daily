// Last updated: 21/07/2026, 23:12:21
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        
        int cnt=0;
        for(int i=0;i<nums.size();i++){
            int sum=0;
            for(int j=i;j<nums.size();j++){ // j=i because we have to check every possible sum equal to k. it gives 
                sum+=nums[j];               // starting point and ending point in array.
                if(sum==k){
                    cnt++;
                }
            }
        
        }
        return cnt;
    }
};