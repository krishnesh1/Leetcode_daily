// Last updated: 21/07/2026, 23:13:55
class Solution {
    public int singleNumber(int[] nums) {
        
        int res = 0;
        for(int x : nums){
            res^=x;
        }
        return res;
    }
}