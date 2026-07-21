// Last updated: 21/07/2026, 23:12:27
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n = nums.length;

        int [] arr = new int[nums.length];
        Stack<Integer>st = new Stack<>();

        for(int i=2*n-1;i>=0;i--){

            int curr = nums[i%n];

            while(!st.isEmpty() && curr >= st.peek()){
                st.pop();
            }

            if(i < n){
                arr[i] = st.isEmpty() ? -1 : st.peek();
            }

            st.push(curr);
        }

        return arr;
    }
}