// Last updated: 21/07/2026, 23:13:26
class Solution {
    public boolean isHappy(int n) {

        int temp = n;
        int sum = 0;
        while(temp!=1){
            sum=0;
            while(temp!=0){
                sum+=Math.pow(temp%10,2);
                temp/=10;
            }
            temp = sum;

            if(temp == n || temp == 4) return false;
        }
        return true;
        
    }
}