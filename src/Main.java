import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        MinimumOftheArray finder = new MinimumOftheArray(arr);
        System.out.println("Minimum of numbers: "+ finder.findMinimum());
        AverageCalculator calculator = new AverageCalculator(arr);
        System.out.println("Average of numbers: "+ calculator.calculateAverage());
    }
}
