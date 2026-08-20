// Last updated: 20/08/2026, 17:58:48
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3
4        HashMap<Integer, Integer> mpp = new HashMap<>();
5        int n = nums.length;
6        for(int i=0;i<n;i++){
7            int needed = target - nums[i];
8
9            if(mpp.containsKey(needed)){
10                return new int []{mpp.get(needed),i};
11            }else{
12                mpp.put(nums[i],i);
13            }
14        }
15        return new int []{};
16    }
17}