// Last updated: 21/07/2026, 23:12:16
class Solution {
    public int leastBricks(List<List<Integer>> wall) {

        Map<Integer,Integer>mpp = new HashMap<>();
        for(List<Integer>ls:wall){
            int prefixSum=0;
            for(int i:ls){
                prefixSum+=i;
                mpp.put(prefixSum,mpp.getOrDefault(prefixSum,0)+1);
            }
        }
        int smax=0,max=0;
        for(Map.Entry<Integer,Integer>entry:mpp.entrySet()){
            if(entry.getValue()>max){
                smax=max;
                max=entry.getValue();
            }else if(entry.getValue()>smax){
                smax=entry.getValue();
            }
        }
        return max-smax;
    }

    // paila iterate garne list ma , and sum gardai hashmap garne frequecy count garne
    // tespaxi second maximum line ani tyo line dekhi katdine .. as question said ki kati ota 
    // mimimum brick cut hunxa.
}