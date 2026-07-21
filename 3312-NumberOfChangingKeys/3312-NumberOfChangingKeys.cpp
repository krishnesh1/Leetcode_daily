// Last updated: 21/07/2026, 23:10:50
class Solution {
public:
    int countKeyChanges(string s) {
        int cnt=0;
        for(int i=0;i<s.size()-1;i++){
            if(tolower(s[i])!=tolower(s[i+1])){
                cnt++;
            }
        }
        return cnt;
    }
};