import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.print("Enter a: ");
        int a=input.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        //Problem 1
        MinimumOftheArray finder = new MinimumOftheArray(arr);
        System.out.println("Minimum of numbers: "+ finder.findMinimum());

        //Problem 2
        AverageCalculator calculator = new AverageCalculator(arr);
        System.out.println("Average of numbers: "+ calculator.calculateAverage());

        //Problem 3
        PrimeNumber checker = new PrimeNumber(n);
        System.out.println("Prime number: "+ checker.checkPrime());

        //Problem 4
        Factorial calculator2 = new Factorial(n);
        System.out.println("Factorial: " + calculator2.computeFactorial());

        //Problem 5
        Fibonacci calculator3 = new Fibonacci(n);
        System.out.println("Fibonacci: "+ calculator3.computeFibonacci());

        //Problem 6
        DegreeFinder calculatorDegree=new DegreeFinder(n,a);
        System.out.println("a^n: " + calculatorDegree.CalculateDegree());



    }
}
