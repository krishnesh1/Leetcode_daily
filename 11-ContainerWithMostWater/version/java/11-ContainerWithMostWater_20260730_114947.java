// Last updated: 30/07/2026, 11:49:47
1public class Solution {
2    public boolean isSubsequence(String s, String t) {
3        if (s.length() == 0)
4            return true;
5        int indexS = 0, indexT = 0;
6        while (indexT < t.length()) {
7            if (t.charAt(indexT) == s.charAt(indexS)) {
8                indexS++;
9                if (indexS == s.length())
10                    return true;
11            }
12            indexT++;
13        }
14        return false;
15
16    }
17}