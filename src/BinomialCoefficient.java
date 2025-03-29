public class BinomialCoefficient {
    private int n, k;

    public BinomialCoefficient(int n, int k) {
        this.n = n;
        this.k = k;
    }

    /**
     * This method calculates the binomial coefficient C(n, k) using recursion.
     * The formula used is:
     * C(n, k) = C(n-1, k-1) + C(n-1, k)
     * Base cases: C(n, 0) = C(n, n) = 1
     *
     * Time complexity: O(2^n), since each call branches into two more calls.
     *
     * @return The binomial coefficient C(n, k).
     * @param n The total number of elements.
     * @param k The number of elements chosen.
     */
    public int computeBinomialCoefficient() {
        return binomial(n, k);
    }

    private int binomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }
}
