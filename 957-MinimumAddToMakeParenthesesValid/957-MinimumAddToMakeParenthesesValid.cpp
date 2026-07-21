// Last updated: 21/07/2026, 23:11:36
class Solution {
public:
    int minAddToMakeValid(string s) {
        int openCnt=0;
        int insertion=0;
        for(int i=0;i<s.size();i++){
            if(s[i]=='('){
                openCnt++;
            }else{
                if(openCnt>0){
                    openCnt--;
                }else{
                    insertion++;
                }
            }
        }
        return insertion+openCnt;
    }
};