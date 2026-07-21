// Last updated: 21/07/2026, 23:11:41
class Solution {
    public int sumSubarrayMins(int[] arr) {

        int n = arr.length;
        int MOD = 1000000007;

        int[] pse = new int[n];
        int[] nse = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                pse[i] = -1;
            } else {
                pse[i] = st.peek();
            }

            st.push(i);
        }

        st.clear();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                nse[i] = n;
            } else {
                nse[i] = st.peek();
            }

            st.push(i);
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {

            long left = i - pse[i];
            long right = nse[i] - i;

            sum = (sum + (arr[i] * left * right) % MOD) % MOD;
        }

        return (int) sum;

    }
}