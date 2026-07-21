// Last updated: 21/07/2026, 23:10:53
class Solution {
public:
    int differenceOfSums(int n, int m) {
        int evenSum=0,oddSum=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                evenSum+=i;
            }else{
                oddSum+=i;
            }
        }
        return evenSum-oddSum;
    }
};