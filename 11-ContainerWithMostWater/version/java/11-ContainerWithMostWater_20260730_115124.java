// Last updated: 30/07/2026, 11:51:24
1public class Solution {
2    public boolean isSubsequence(String s, String t) {
3        if (s.length() == 0)
4            return true;
5        int n = t.length();
6        int sIdx = 0, tIdx = 0;
7
8        while (tIdx < n) {
9
10            if (t.charAt(tIdx) == s.charAt(sIdx)) {
11                sIdx++;
12            }
13            if (sIdx == s.length())
14                return true;
15
16            tIdx++;
17        }
18
19        return false;
20
21    }
22}