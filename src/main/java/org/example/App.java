package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        int number = 30;

        long startTime = System.nanoTime();
        FibonacciIteration iterativeResult = new FibonacciIteration();
        long endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;

        startTime = System.nanoTime();
        FibonacciRecursion recursiveMemoResult = new  FibonacciRecursion();
        endTime = System.nanoTime();
        long recursiveMemoTime = endTime - startTime;

        startTime = System.nanoTime();
        FibonacciDynamic dynamicResult = new FibonacciDynamic();
        endTime = System.nanoTime();
        long dynamicTime = endTime - startTime;


        System.out.println("Iterative Method: Fibonacci(" + number + ") = " + iterativeResult + " Time: " + iterativeTime + " ns");
        System.out.println("Recursive with Memo Method: Fibonacci(" + number + ") = " + recursiveMemoResult + " Time: " + recursiveMemoTime + " ns");
        System.out.println("Dynamic Method: Fibonacci(" + number + ") = " + dynamicResult + " Time: " + dynamicTime + " ns");
    }
}
