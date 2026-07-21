// Last updated: 21/07/2026, 23:11:37
class Solution {
    public int fib(int n) {
        
        if(n<=1) return n;

        return fib(n-1)+fib(n-2);
        
    }
}