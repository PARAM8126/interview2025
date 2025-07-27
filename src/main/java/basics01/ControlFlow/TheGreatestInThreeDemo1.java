package basics01.ControlFlow;

import java.util.Scanner;

public class TheGreatestInThreeDemo1
{
    public static void main(String[] args)
    {
        Scanner sc = new  Scanner (System.in);
        System.out.println("Enter the  age of Param : ");
        int Param  = sc.nextInt();
        System.out.println("Enter the age of Shivam ");
        int Shivam  = sc.nextInt();
        System.out.println("Enter the  age of Sunil ");
        int Sunil  = sc.nextInt();

        if(Param>Shivam && Param>Sunil)
        {
            System.out.println(Param+ " is the Greatest Person ");
        }else if (Shivam>Param && Param>Sunil)
        {
            System.out.println(Shivam+ " is the Greatest Person ");
        }else
        {
            System.out.println(Sunil+ " is the Greatest Person ");
        }


    }
}
