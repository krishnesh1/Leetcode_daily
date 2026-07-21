// Last updated: 21/07/2026, 23:15:44
class Solution {
public:
    int reverse(int x) {
        long long result=0;
        while(x){
            int digit=x%10;
            result=result*10+digit;
            x/=10;
        }
        if(result<INT_MIN || result>INT_MAX){
            return 0;
        }
        return static_cast<int>(result); // this line is used to convert result into int;
       
    }
};