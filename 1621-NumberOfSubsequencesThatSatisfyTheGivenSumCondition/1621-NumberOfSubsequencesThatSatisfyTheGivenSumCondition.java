// Last updated: 21/07/2026, 23:11:19
class Solution {
    int MOD = 1000000007;

    public int numSubseq(int[] nums, int target) {

        Arrays.sort(nums);
        int n = nums.length;

        int pow [] = new int[n];
        pow[0] = 1;

        for(int i=1;i<n;i++){
            pow[i]=(pow[i-1]*2)%MOD;
        }

        int left =0,right = n-1;
        int cnt = 0;
        while(left <= right ){
            if(nums[left]+nums[right] <= target){
                cnt=(cnt+pow[right-left]) %MOD;
                left++;
            }else{
                right--;
            }
        }
        return cnt;

    }
}