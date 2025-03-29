class PrimeNumber {
    private int number;

    public PrimeNumber(int number) {
        this.number = number;
    }

    /**
     * This method checks if a number is prime.
     * A prime number is only divisible by 1 and itself.
     *
     * Time complexity: O(√n), where n is the input number.
     * Instead of iterating up to n, we only check up to √n for efficiency.
     *
     * @return "Prime" if the number is prime, otherwise "Composite".
     */
    public String checkPrime() {
        if (number < 2) {
            return "Composite";
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return "Composite";
            }
        }
        return "Prime";
    }
}