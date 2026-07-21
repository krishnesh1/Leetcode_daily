// Last updated: 21/07/2026, 23:12:53
class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int n = nums.length;
        int i=0;
        while(i<n && j<n){
            if(nums[i]==0){
                i++;
               
            } 
            else {
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
                i++;
            }
        }
    }
}