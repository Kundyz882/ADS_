import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(findMinimum(n, arr));
    }

    /**
     * This method finds the minimum element in an array.
     * It uses an iterative approach with a for loop.

     * Time complexity: O(n), where n is the number of elements in the array.
     * The algorithm iterates through all elements once, resulting in linear time complexity.

     * @param n   The number of elements in the array.
     * @param arr The array from which the minimum value is to be found.
     * @return The minimum element in the given array.
     */
    public static int findMinimum(int n, int[] arr) {
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
