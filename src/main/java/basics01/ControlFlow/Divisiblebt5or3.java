package basics01.ControlFlow;

import java.util.Scanner;

public class Divisiblebt5or3
{
    public static void main(String[] args)
    {
        Scanner sc = new  Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        if(n % 5 == 0 || n % 3 ==0)
        {
            System.out.println(" this is divisible by either 3 or 5 ");
        }
        else
        {
            System.out.println(" not  devisible by either 5 or 3");
        }
    }
}
