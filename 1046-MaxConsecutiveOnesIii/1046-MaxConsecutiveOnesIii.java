// Last updated: 21/07/2026, 23:11:33
class Solution {
    public int longestOnes(int[] nums, int k) {

        int max = 0;
        int r = 0;
        int l = 0;
        int n = nums.length;
        int zero = 0;
        while(r<n){

            if(nums[r]==0) zero++;

            if(zero > k){
                if(nums[l]==0) zero--;
                l++;
            }

            if(zero <= k){
                int len = r - l + 1;
                max = Math.max(len,max);
            }
            r++;
        }
        return max;
    }
}