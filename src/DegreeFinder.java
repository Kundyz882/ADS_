public class DegreeFinder {
    public int n;
    public int a;

    public DegreeFinder(int n, int a) {
        this.n = n;
        this.a = a;
    }

    /**
     * This class calculates the power of a number using iteration.
     * It raises the base 'a' to the exponent 'n'.

     * Time complexity: O(n), where n is the exponent.
     * The algorithm iterates 'n' times, multiplying the base 'a' in each step.
     *
     * @param n The exponent to which the base is raised.
     * @param a The base number.
     * @return The result of a^n.
     */

    public int CalculateDegree() {
        int multiplier = 1;
        for (int i = 0; i < n; i++) {
            multiplier *= a;
        }
        return multiplier;


    }
}
