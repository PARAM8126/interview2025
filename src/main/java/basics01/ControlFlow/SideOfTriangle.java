package basics01.ControlFlow;

import java.util.Scanner;

public class SideOfTriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new  Scanner (System.in);
        System.out.println("Enter the first side ");
        int a  = sc.nextInt();
        System.out.println("Enter the Second side ");
        int b  = sc.nextInt();
        System.out.println("Enter the Third side ");
        int c  = sc.nextInt();

        if((a+b) >c && (b+c) >a && (a+c) >b)
        {
            System.out.println("Valid triangle");
        }else
        {
            System.out.println("Invalid triangle");
        }


    }
}
