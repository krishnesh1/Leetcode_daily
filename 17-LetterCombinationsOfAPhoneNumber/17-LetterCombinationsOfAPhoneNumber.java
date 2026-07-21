// Last updated: 21/07/2026, 23:15:33
class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String>res = new ArrayList<>();
        Map<Character,String>mpp = new HashMap<>();

        mpp.put('2',"abc");
        mpp.put('3',"def");
        mpp.put('4',"ghi");
        mpp.put('5',"jkl");
        mpp.put('6',"mno");
        mpp.put('7',"pqrs");
        mpp.put('8',"tuv");
        mpp.put('9',"wxyz");
  

        res.add("");

        for(char digit : digits.toCharArray()){

            String letter = mpp.get(digit);
            List<String>temp = new ArrayList<>();

            for(String prefix:res){
                for(char ch:letter.toCharArray()){
                    temp.add(prefix+ch);
                }
            }
            res=temp;
        }
        return res;
    }
}