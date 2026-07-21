// Last updated: 21/07/2026, 23:13:42
class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        vector<int>ans;
        int n=nums.size();
        k=k%n;
        for(int i=n-k;i<n;i++){
           ans.push_back(nums[i]);
        }

        for(int i=0;i<n-k;i++){
            ans.push_back(nums[i]);
        }
        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
    }
};