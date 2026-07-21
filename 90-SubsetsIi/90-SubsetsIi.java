// Last updated: 21/07/2026, 23:14:38
class Solution {

    public void solve(int index,List<List<Integer>>result,List<Integer>list,int [] nums){

        if(index == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[index]);
        solve(index+1,result,list,nums);

        list.remove(list.size()-1);

        while(index+1 < nums.length && nums[index] == nums[index+1]){
            index++;
        }

        solve(index+1,result,list,nums);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        solve(0,result,list,nums);

        return result;
        
    }
}