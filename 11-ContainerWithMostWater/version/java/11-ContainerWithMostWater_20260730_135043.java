// Last updated: 30/07/2026, 13:50:43
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3
4       return build(s).equals(build(t));
5    }
6
7    private String build(String str){
8
9        StringBuilder sb = new StringBuilder();
10        for(char ch : str.toCharArray()){
11
12            if(ch != '#'){
13                sb.append(ch);
14            }else if(sb.length() > 0){
15                sb.deleteCharAt(sb.length()-1);
16            }
17        }
18        return sb.toString();
19    }
20}