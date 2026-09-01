// Last updated: 01/09/2026, 22:36:29
1class Solution {
2    public void moveZeroes(int[] nums) {
3        
4        int i=0,j=0;
5        int n = nums.length;
6
7        while(i<n && j<n){
8            if(nums[i]==0){
9                i++;
10            }else{
11                int temp = nums[i];
12                nums[i]=nums[j];
13                nums[j]=temp;
14                i++;
15                j++;
16            }
17        }
18    }
19}