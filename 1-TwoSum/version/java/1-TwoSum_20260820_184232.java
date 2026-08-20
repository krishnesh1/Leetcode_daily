// Last updated: 20/08/2026, 18:42:32
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3
4        List<List<Integer>> res = new ArrayList<>();
5
6        if(nums.length < 3 ) return res;
7        Arrays.sort(nums);
8
9        for(int i=0;i<nums.length-2;i++){
10
11            if( i>0 && nums[i] == nums[i-1]) continue;
12            if(nums[i]>0) break;
13
14            int left = i+1,right = nums.length -1;
15            int target = -nums[i];
16
17            while(left < right){
18                int sum = nums[left]+nums[right];
19
20                if(sum==target){
21                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
22                    left++;
23                    right--;
24
25                    while(left < right && nums[left] == nums[left-1]) left++;
26                    while(left < right && nums[right] == nums[right+1]) right--;
27                }else if(sum < target){
28                    left++;
29                }else{
30                    right--;
31                }
32            }
33        }
34        return res;
35
36        
37    }
38}