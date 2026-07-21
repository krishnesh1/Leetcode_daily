// Last updated: 21/07/2026, 23:15:00
class Solution {
    public double myPow(double x, int n) {
        long N = n; // Convert to long to handle overflow safely
        
        // If exponent is negative, invert x and make n positive
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return fastPow(x, N);
    }

    private double fastPow(double x, long n) {
        // Base case
        if (n == 0) return 1;

        // Divide and conquer (recursive)
        double half = fastPow(x, n / 2);

        // If n is even → x^(n) = (x^(n/2))^2
        // If n is odd  → x^(n) = (x^(n/2))^2 * x
        if (n % 2 == 0)
            return half * half;
        else
            return half * half * x;
    }
}
