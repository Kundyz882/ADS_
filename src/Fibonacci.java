public class Fibonacci {
    private int number;

    public Fibonacci(int number) {
        this.number = number;
    }

    /**
     * This method finds the n-th Fibonacci number using recursion.
     * The Fibonacci sequence is defined as:
     *   F(n) = F(n-1) + F(n-2)
     *   Base cases: F(0) = 0, F(1) = 1

     * Time complexity: O(2^n), where n is the input number.
     * @param number The position of the Fibonacci sequence to calculate.
     * @return The n-th Fibonacci number.
     */
    public int computeFibonacci() {
        return fibonacci(number);
    }

    private int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}


