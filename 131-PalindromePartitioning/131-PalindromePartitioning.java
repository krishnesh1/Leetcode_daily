// Last updated: 21/07/2026, 23:13:57
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>result = new ArrayList<>();
        List<String>list = new ArrayList<>();
        backtrack(0,result,list,s);
        return result;
    }

    public void backtrack(int idx, List<List<String>>result,List<String>list,String s){

        if(idx == s.length()){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx;i<s.length();i++){

            String sub = s.substring(idx,i+1);

            if(isPalindrom(sub)){
                list.add(sub);
                backtrack(i+1,result,list,s);
                list.remove(list.size()-1);
            }
        }
    }

    public boolean isPalindrom(String s){

        int start = 0;
        int e = s.length()-1;
        while(start<=e){
            if(s.charAt(start)!=s.charAt(e)){
                return false;
            }
            start++;
            e--;
        }
        return true;
    }
}