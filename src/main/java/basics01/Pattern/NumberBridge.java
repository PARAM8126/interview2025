package basics01.Pattern;

import java.util.Scanner;

public class NumberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user for number of rows
        System.out.println("Enter n");
        int n = sc.nextInt();

        // Print the top row — numbers from 1 to (2*n - 1)
        // This creates the "bridge" top line with consecutive numbers
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();  // move to next line after printing top row

        n--;  // reduce n by 1, because we will print n rows below (excluding top row)

        // Loop for printing the lower part of the "number bridge"
        for (int i = 1; i <= n; i++) {
            int a = 1;  // Initialize counter 'a' starting at 1 for each row

            // Print left side numbers decreasing in count each row
            // For i=1, print (n+1-1) = n times; for next row decrease by 1, and so on
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(a++ + " ");  // print the number and increment 'a'
            }

            // Print the middle gap spaces which increase by 2 spaces each row
            // This gap forms the "bridge" empty space in center
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("  ");  // two spaces to align well
                a++;  // increment 'a' to keep numbers consecutive on right side
            }

            // Print right side numbers, same count as left side
            // Numbers continue from the last incremented 'a'
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();  // move to next line after finishing current row
        }
    }
}
