public class Fibonacci {
    /**
     * This method calculates the n-th Fibonacci number using recursion.
     * The Fibonacci sequence is defined as:
     *   F(n) = F(n-1) + F(n-2)
     *   Base cases: F(0) = 0, F(1) = 1
     *
     * Time complexity: O(2^n), since each call branches into two more calls.
     *
     * @param n The position in the Fibonacci sequence.
     * @return The n-th Fibonacci number.
     */
    public int findFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}
