// Last updated: 21/07/2026, 23:12:15
class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        mpp.put(0,1);

        int cnt =0;
        int sum =0;
        for(int i=0;i<arr.length;i++){

            sum+=arr[i];

            if(mpp.containsKey(sum-k)){
                cnt+=mpp.get(sum-k);
            }
                mpp.put(sum,mpp.getOrDefault(sum,0)+1);
            
        }

        return cnt;
        
    }
}