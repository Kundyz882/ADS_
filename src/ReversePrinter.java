import java.util.Scanner;

public class ReversePrinter {


    /**
     * This method reads the input and prints it in reverse order using recursion.
     * It does not use an array to store elements.
     *
     * Time complexity: O(n), where n is the number of elements.
     *
     * @return A string containing the elements in reverse order.
     *
     */

    public void reversePrint(int n, Scanner input) {
        if (n == 0) {
            return;
        }
        int num = input.nextInt();
        reversePrint(n - 1, input);
        System.out.print(num + " ");

    }
}

