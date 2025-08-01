package basics01.Pattern;
import java.util.Scanner;

public class StarBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        // Print top row of stars (2n-1 stars)
        for (int i = 1; i <= 2*n-1; i++) {
            System.out.print("* ");
        }
        System.out.println();

        n--; // Now n is reduced by 1 for the lower part

        // Print the lower bridge rows
        for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print("* ");
            }
            // Spaces in the middle (the gap or "bridge")
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("  "); // 2 spaces for alignment
            }
            // Right stars
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
 // output
// Enter n
//6
//* * * * * * * * * * *
//* * * * *   * * * * *
//* * * *       * * * *
//* * *           * * *
//* *               * *
//*                   *