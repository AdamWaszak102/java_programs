package pl.coderstrust.fibonacci;

/**
 * Created by Adam on 2018-02-12.
 */

public class Fibonacci {


    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Fibonacci Interative");
        System.out.println("");


        System.out.println(fibonacciIterative(1));
        System.out.println(fibonacciIterative(3));
        System.out.println(fibonacciIterative(30));
        System.out.println("");


        System.out.println("Fibonacci Recursive");
        System.out.println("");


        System.out.println(fibonacciRecursive(1));
        System.out.println(fibonacciRecursive(3));
        System.out.println(fibonacciRecursive(5));

    }


    public static int fibonacciIterative(int n) {

        int firstFibonacciSeries, secondFibonacciSeries;
        if (n == 0) return 0;

        firstFibonacciSeries = 0;
        secondFibonacciSeries = 1;
        for (int i = 0; i < (n - 1); i++) {
            secondFibonacciSeries = secondFibonacciSeries + firstFibonacciSeries;
            firstFibonacciSeries = secondFibonacciSeries - firstFibonacciSeries;
        }
        return secondFibonacciSeries;
    }

    public static int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

}