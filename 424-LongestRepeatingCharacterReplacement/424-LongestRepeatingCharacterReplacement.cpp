// Last updated: 21/07/2026, 23:12:38
class Solution {
public:
    int characterReplacement(string s, int k) {
        int n = s.size();
        int l = 0, r = 0;
        int maxlen = 0;
        map<char,int>mpp;
        int maxCount = 0; // track most frequent char in window

        while (r < n) {
            mpp[s[r]]++;
            maxCount = max(maxCount, mpp[s[r]]);

            // if replacements needed > k, shrink window
            int changes = (r-l+1)-maxCount;
            if (changes > k) {
                mpp[s[l]]--;
                l++;
            }

            int len = r - l + 1;
            maxlen = max(maxlen, len);

            r++;
        }
        return maxlen;
    }
};
