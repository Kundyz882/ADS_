public class MinimumOftheArray {
    private int[] arr;

    public MinimumOftheArray(int[] arr) {
        this.arr = arr;
    }

    /**
     * This method finds the minimum element in an array.
     * It uses an iterative approach with a for loop.
     *
     * Time complexity: O(n), where n is the number of elements in the array.
     * The algorithm iterates through all elements once, resulting in linear time complexity.
     * @param arr The input array containing elements.
     * @return The minimum element in the given array.
     */
    public int findMinimum() {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}