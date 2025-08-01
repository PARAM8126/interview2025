package basics01.Loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
       int  num = sc.nextInt();
         int res=0; // Variable to store the reversed number

         while(num!=0){ // Loop runs until 'num' becomes 0

             int rem = num%10; // Find remainder (last digit of num)

             res = rem + res*10; // Build reversed number from digits

             num = num/10; // // Remove last digit from num by integer division
         }
        System.out.println(res);
    }
}
