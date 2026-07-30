// Last updated: 30/07/2026, 11:22:06
1class Solution {
2    public void sortColors(int[] nums) {
3
4        int low = 0;
5        int mid = 0;
6        int high = nums.length-1;
7
8        while(mid <= high){
9
10            if(nums[mid] == 0){
11                swap(nums,low,mid);
12                low++;
13                mid++;
14            }else if(nums[mid] == 1){
15                mid++;
16            }else{
17                swap(nums,mid,high);
18                high--;
19            }
20        }
21    }
22
23    public void swap(int [] nums,int i,int j){
24
25        int temp = nums[i];
26        nums[i] = nums[j];
27        nums[j] = temp;
28    }
29}