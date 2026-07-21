// Last updated: 21/07/2026, 23:10:52
class Solution {
public:
    bool isBalanced(string num) {
        vector<int>v;
        for(char c:num){
            v.push_back(c-'0');
        }
        int even=0,odd=0;
       for(int i=0;i<v.size();i++){
            if(i%2==0) even+=v[i];
            else odd+=v[i];
       }
       return even==odd;
    }
};