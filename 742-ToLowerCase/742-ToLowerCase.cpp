// Last updated: 21/07/2026, 23:11:59
class Solution {
public:
    string toLowerCase(string s) {
        string str="";
        for(int i=0;i<s.size();i++){
            char ch=s[i];
            str+=tolower(ch);

        }
        return str;
    }
};