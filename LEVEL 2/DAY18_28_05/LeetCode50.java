class Solution {
    public double myPow(double x, int n) {
        long N = n;  // handle negative edge case
        
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        double result = 1.0;
        
        while (N > 0) {
            // If n is odd
            if ((N % 2) == 1) {
                result *= x;
            }
            
            // Square the base
            x *= x;
            N /= 2;
        }
        
        return result;
    }
}
