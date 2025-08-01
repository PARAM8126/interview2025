/* The Fibonacci series is a sequence where each number is the sum of the two preceding ones, starting from 0 and 1. The series looks like this:

        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... */

package basics01.Loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();

        // Initialize first two terms of Fibonacci series
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            // Print current term
            System.out.print(firstTerm + " ");

            // Calculate next term by adding previous two terms
            int nextTerm = firstTerm + secondTerm;

            // Update firstTerm and secondTerm for next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
