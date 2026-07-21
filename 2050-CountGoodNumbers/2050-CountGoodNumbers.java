// Last updated: 21/07/2026, 23:11:08
class Solution {

    static final long MOD = 1000000007;

    public long power(long x, long n) {
        long result = 1;

        while (n > 0) {
            if (n % 2 == 1) {
                result = (result * x) % MOD;
            }
            x = (x * x) % MOD;
            n = n / 2;
        }
        return result;
    }

    public int countGoodNumbers(long n) {

        long evenCount = (n + 1) / 2;
        long oddCount = n / 2;

        long evenPart = power(5, evenCount);
        long oddPart = power(4, oddCount);

        return (int) ((evenPart * oddPart) % MOD);
    }
}