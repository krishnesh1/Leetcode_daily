// Last updated: 25/08/2026, 15:52:12
1class Solution {
2    public void rotate(int[] arr, int k) {
3        
4        int n = arr.length;
5        int K = k % n;
6
7        reverse(arr,0,n-1);
8        reverse(arr,0,K-1);
9        reverse(arr,K,n-1);
10    }
11
12    public void reverse(int [] nums,int start,int end){
13
14        while(start < end){
15            int temp = nums[start];
16            nums[start]=nums[end];
17            nums[end] = temp;
18            start++;
19            end--;
20        }
21    }
22}