// Last updated: 21/07/2026, 23:13:01
class Solution {
public:
    bool isAnagram(string s, string t) {
          if (s.length() != t.length()) return false;
      vector<int>count(26);
      for(auto c:s) count[c-'a']++;
      for(auto c:t) count[c-'a']--;
        for(int c:count){
            if(c!=0) return false;
        }
        return true;
    }
};