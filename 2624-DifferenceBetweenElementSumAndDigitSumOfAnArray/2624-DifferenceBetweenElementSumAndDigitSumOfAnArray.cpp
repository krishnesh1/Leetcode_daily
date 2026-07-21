// Last updated: 21/07/2026, 23:10:58
class Solution {
public:

    int digitSum(int n){
        int temp=n;
        int sum=0;
        while(temp){
            int digit=temp%10;
            sum+=digit;
            temp/=10;
        }
        return sum;
    }

    int differenceOfSum(vector<int>& nums) {
        int eleSum=0;
        int digSum=0;
        for(int i=0;i<nums.size();i++){
            eleSum += nums[i];
            digSum += digitSum(nums[i]);
        }
        return abs(eleSum-digSum);
    }
};