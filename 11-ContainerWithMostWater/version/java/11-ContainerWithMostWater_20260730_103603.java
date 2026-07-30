// Last updated: 30/07/2026, 10:36:03
1class Solution {
2    public void sortColors(int[] nums) {
3
4        for(int i=0;i<nums.length;i++){
5            for(int j = 0;j<nums.length-1;j++){
6                if(nums[j]>nums[j+1]){
7                    int temp = nums[j];
8                    nums[j] = nums[j+1];
9                    nums[j+1] = temp;
10                }
11            }
12        }
13    }
14}