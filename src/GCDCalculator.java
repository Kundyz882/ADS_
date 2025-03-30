public class GCDCalculator {
    /**
     * This method calculates the GCD of two numbers using iteration.
     * It starts from the smallest of the two numbers and finds the largest divisor.
     *
     * Time complexity: O(min(a, b)), since it checks all numbers up to min(a, b).
     *
     * @param a The first number.
     * @param b The second number.
     * @return The GCD of a and b.
     */
    public int findGCD(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
