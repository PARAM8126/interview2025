package basics01.ControlFlow;

import java.util.Scanner;

public class Divisiblebt5And3
{
    public static void main(String[] args)
    {
        Scanner sc = new  Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        if(n % 5 == 0 && n % 3 ==0) // (n%15==0)
        {
            System.out.println(" this is divisible by both 5 and 3 ");
        }else if(n % 5 == 0)
        {
            System.out.println("this number is devisible by 5");
        }else if(n % 3 == 0)
        {
            System.out.println("this number is devisible by 3");
        }
        else
        {
            System.out.println("this number is not  devisible by 5 or 3");
        }
    }
}
