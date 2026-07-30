// Last updated: 30/07/2026, 11:35:06
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int arr [] = new int[nums.length];
4
5        int i=0,j=1;
6        for(int num: nums){
7            if(num<0){
8                arr[j]=num;
9                j+=2;
10            }else{
11                arr[i]=num;
12                i+=2;
13            }
14        }
15        return arr;
16    }
17}