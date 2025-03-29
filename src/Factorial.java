public class Factorial {
    private int number;
    public Factorial(int number) {
        this.number = number;
    }

    /**
     * This method calculates the factorial of a number recursively.
     * Factorial of n (n!) is defined as:
     *   n! = n * (n-1)!
     *   Base case: 1! = 1 and 0! = 1
     * Time complexity: O(n), where n is the input number.
     * Since each recursive call decreases n by 1, there are n recursive calls.
     * @param number The number for which the factorial is to be calculated.
     * @return The factorial of the given number.
     */
    public int computeFactorial() {
        return factorial(number);
    }

    private int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

