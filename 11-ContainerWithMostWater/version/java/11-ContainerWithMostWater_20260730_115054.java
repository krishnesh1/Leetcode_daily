// Last updated: 30/07/2026, 11:50:54
1public class Solution {
2    public boolean isSubsequence(String s, String t) {
3        if (s.length() == 0)
4            return true;
5       
6
7
8        int n = t.length();
9        int sIdx = 0, tIdx = 0;
10
11        while(tIdx < n){
12
13            if(t.charAt(tIdx) == s.charAt(sIdx)){
14                sIdx++;
15            }
16            if(sIdx == s.length()) return true;
17
18            tIdx++;
19        }
20
21        return false;
22
23    }
24}