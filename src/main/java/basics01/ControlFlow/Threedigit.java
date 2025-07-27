package basics01.ControlFlow;

import java.util.Scanner;

public class Threedigit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

         if(n>99 && n<1000)
         {
             System.out.println("the number is , three digit number");

         }else
         {
             System.out.println("the number is not  , three digit number");
         }

    }
}
