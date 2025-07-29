package basics01.Loops;

import java.util.Scanner;

public class ApNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
         // 1,3,5,7,9.....
        /* for(int i = 1; i<=2* n -1; i+=2)
        {
            System.out.println(i);
        } */
        //  4,7,11,13...
        int a = 4;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a = a + 3;
        }

    }
}
