// Last updated: 21/07/2026, 23:11:29
class Solution {
public:
    string removeOuterParentheses(string s) {
        
        int cnt=0;
        int i=0;
        string result="";
        while(i<s.size()){
            if(s[i]=='('){
                if(cnt>0){
                    result+=s[i];
                }
                cnt++;
            }else{
                cnt--;
                if(cnt>0){
                    result+=s[i];
                }
            }
            i++;
        }
        return result;
    }
};