// Last updated: 21/07/2026, 23:11:48
class Solution {
public:
    bool rotateString(string s, string goal) {
        
        for(int i=0;i<s.length();i++){
          string rotation = s.substr(i)+s.substr(0,i);
          if(rotation==goal){
            return true;
          }
        }
        return false;
    }
};