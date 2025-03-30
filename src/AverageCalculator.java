import java.util.Scanner;

class AverageCalculator {
    private int[] arr; // Field to store the array

    // Constructor
    public AverageCalculator(int[] arr) {
        this.arr = arr;
    }

    /**
     * This method calculates the average of an array.
     * It iterates through all elements using a for loop to compute the sum.
     * Time complexity: O(n), where n is the number of elements in the array.
     * The algorithm traverses the array once, resulting in linear time complexity.
     *
     * @return The average of the elements as a double.
     */
    public double calculateAverage() {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}
