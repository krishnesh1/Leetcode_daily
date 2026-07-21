// Last updated: 21/07/2026, 23:13:40
class Solution {
    public int findPeakElement(int[] nums) {
        
        int left = 0;
        int right = nums.length-1;
        
        while(left < right){
            int mid = left + (right-left)/2;

            if(nums[mid] > nums[mid+1]){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return right;
    }
}