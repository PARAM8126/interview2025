package basics01.Pattern;

import java.util.Scanner;

public class NumberPyramidPalindrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // TWO spaces
            }
            // Print increasing numbers 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Print decreasing numbers i-1 to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

//output
//Enter n
//4
//      1
//    1 2 1
//  1 2 3 2 1
//1 2 3 4 3 2 1