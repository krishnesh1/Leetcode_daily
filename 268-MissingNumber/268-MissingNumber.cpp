// Last updated: 21/07/2026, 23:12:56
#include<vector>
class Solution {
public:
    int missingNumber(vector<int>& nums) {
     int n=nums.size();
     int expectedSum=n*(n+1)/2;
     int actualSum=0;
     for(int num:nums){
        actualSum+=num;
     }
     return expectedSum-actualSum;
    }
};