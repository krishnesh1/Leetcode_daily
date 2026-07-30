// Last updated: 30/07/2026, 10:28:42
1class Solution {
2    public int maxArea(int[] height) {
3
4        int max = Integer.MIN_VALUE;
5        int n = height.length;
6
7        int left = 0;
8        int right = n-1;
9
10        while(left <= right){
11
12            int h = Math.min(height[left],height[right]);
13            int w = right - left;
14
15            int area = h * w;
16
17            max = Math.max(max,area);
18
19            if(height[left]<=height[right]){
20                left++;
21            }else{
22                right--;
23            }
24        }
25        return max;
26        
27    }
28}