// Last updated: 21/07/2026, 23:13:20
class Solution {

    public void solve(int start,int k,int target,List<Integer>list,List<List<Integer>>result ){

        if(target ==0 && list.size() == k){
            result.add(new ArrayList<>(list));
            return;
        }

        if(target < 0 || list.size() > k) return;

        for(int i=start;i<= 9;i++){

            list.add(i);

            solve(i+1,k,target-i,list,result);

            list.remove(list.size()-1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> result = new ArrayList<>();

        solve(1,k,n,new ArrayList<>(),result);

        return result;
    }
}