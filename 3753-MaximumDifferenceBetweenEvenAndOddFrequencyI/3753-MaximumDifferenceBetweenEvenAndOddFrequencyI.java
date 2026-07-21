// Last updated: 21/07/2026, 23:10:47
class Solution {
    public int maxDifference(String s) {
        int n=s.length();
        Map<Character,Integer>mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            mpp.put(s.charAt(i),mpp.getOrDefault(s.charAt(i),0)+1);
        }
        int omx=-1,emn=101;
        for(Map.Entry<Character,Integer>entry:mpp.entrySet()){
            if(entry.getValue()%2==0){
                emn=Math.min(emn,entry.getValue());
            }else{
                omx=Math.max(omx,entry.getValue());
            }
        }
        return omx-emn;
    }

    // get maximum vallue from odd one and minimum value from even one and then substract.
}