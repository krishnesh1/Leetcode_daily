// Last updated: 28/07/2026, 10:55:18
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3
4        int n = numbers.length;
5        int left = 0;
6        int right = n-1;
7
8        while(left < right){
9
10            int sum = numbers[left] + numbers[right];
11
12            if(sum == target){
13                return new int[]{left+1,right+1};
14            }else if(sum > target){
15                right --;
16            }else{
17                left++;
18            }
19        }
20
21        return new int[]{-1,-1};
22        
23    }
24}