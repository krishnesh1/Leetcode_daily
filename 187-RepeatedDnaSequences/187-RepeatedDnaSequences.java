// Last updated: 21/07/2026, 23:13:34
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer>mpp = new HashMap<>();
        Set<String>ans = new HashSet<>();
        for(int i=0;i<s.length()-9;i++){
            String str=s.substring(i,i+10);
            if(mpp.containsKey(str)){
                ans.add(str);
                // mpp.put(str,mpp.getOrDefault(str,0)+1);
                mpp.put(str,mpp.get(str)+1);
            }else{
                mpp.put(str,1);
            }
        }
        List<String>result=new ArrayList(ans);
        return result;
    }
}