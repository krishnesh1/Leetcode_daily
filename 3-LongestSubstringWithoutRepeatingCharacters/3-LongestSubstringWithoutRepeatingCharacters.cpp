// Last updated: 21/07/2026, 23:15:53
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        vector<int> freq(256, 0);  // store frequency of each char
        int n = s.size();
        int i = 0, j = 0;          // window [i..j]
        int maxlen = 0;

        while (j < n) {
            // include current char in window
            freq[s[j]]++;

            // if duplicate appears, shrink from left
            while (freq[s[j]] > 1) {
                freq[s[i]]--;
                i++;
            }

            // update max length
            maxlen = max(maxlen, j - i + 1);
            j++;
        }
        return maxlen;
    }
};
