// Last updated: 21/07/2026, 23:12:58
class Solution {
public:

    int countDigits(int n){
        int cnt=0;
        while(n!=0){
            cnt++;
            n/=10;
        }
        return cnt;
    }

    int sumDigits(int n){
        int sum=0;
        while(n){
            int digits=n%10;
            sum+=digits;
            n/=10;
        }
        return sum;
    }

    int addDigits(int num) {
        int temp=num;
        while(countDigits(temp)>1){
            temp=sumDigits(temp);
        }
        return temp;
    }
};