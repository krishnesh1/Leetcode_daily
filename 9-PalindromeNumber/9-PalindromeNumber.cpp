// Last updated: 21/07/2026, 23:15:41
class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0) return false;
        int temp=x;
        long long rev=0;
        while(temp!=0){
            int digit=temp%10;
            rev=rev*10+digit;
            temp/=10;
        }
        return rev==x;
    }
};