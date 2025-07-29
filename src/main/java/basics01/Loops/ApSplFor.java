
//Display this AP - (100,97,94),upto all terms which are positive.
package basics01.Loops;

import java.util.Scanner;

public class ApSplFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        // 100,97,94.....7,4,1 ->34 times
        int a = 100;
        for (int i = 1; i <= 34; i++) {
            System.out.println(a);
            a = a - 3;
        }

    }
}
