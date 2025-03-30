import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Problem 1
        System.out.print("Enter n: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        MinimumOftheArray finder = new MinimumOftheArray(arr);
        System.out.println("Minimum of numbers: "+ finder.findMinimum());


        //Problem 2
        System.out.print("Enter n: ");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter " + n2 + " elements: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }

        AverageCalculator calculator = new AverageCalculator(arr2);
        System.out.println("Average of numbers: " + calculator.calculateAverage());


        //Problem 3
        System.out.print("Enter n : ");
        int n3 = input.nextInt();
        PrimeNumber checker = new PrimeNumber(n3);
        System.out.println(checker.checkPrime() + " number");


        //Problem 4
        System.out.print("Enter n: ");
        int n4 = input.nextInt();
        Factorial calculator2 = new Factorial(n4);
        System.out.println(n4 + "! =  " + calculator2.computeFactorial());


        //Problem 5
        System.out.print("Enter n: ");
        int n5 = input.nextInt();
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("Fibonacci number Of "+n5+" : " + fibonacci.findFibonacci(n5));


        //Problem 6
        System.out.print("Enter a: ");
        int a=input.nextInt();
        System.out.print("Enter n: ");
        int n6=input.nextInt();
        DegreeFinder calculatorDegree=new DegreeFinder(n6,a);
        System.out.println(a+"^"+ n6+ ": " + calculatorDegree.CalculateDegree());


        //Problem 7
        System.out.print("Enter n: ");
        int n7 = input.nextInt();
        ReversePrinter printer = new ReversePrinter();
        System.out.println("Enter " + n7 + " elements: ");
        printer.reversePrint(n7, input);


        //Problem 8
        System.out.print("\nEnter digits: ");
        String s = input.next();
        DigitChecker digirChecker = new DigitChecker();
        System.out.println(digirChecker.isAllDigits(s, 0));


        //Problem 9
        System.out.print("Enter n: ");
        int n9 = input.nextInt();
        System.out.print("Enter k: ");
        int k = input.nextInt();
        BinomialCoefficient calculatorBinominal = new BinomialCoefficient(n9, k);
        System.out.println("C(" + n9 + ", " + k + ") = " + calculatorBinominal.computeBinomialCoefficient());


        //Problem 10
        System.out.print("Enter a: ");
        int m = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();

        GCDCalculator gcdCalculator = new GCDCalculator();
        System.out.println("GCD("+m+" , "+b+") = " + gcdCalculator.findGCD(m, b));
    }
}
