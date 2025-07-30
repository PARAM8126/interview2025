package basics01.Pattern;

import java.util.Scanner;

public class NbyN_Patern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of rows and coloms");
        int rows = sc.nextInt();
        int coloms = sc.nextInt();

        for(int i = 1; i<=rows;i++) // for rows
        {
            for(int j = 1;j<=coloms;j++) // for coloms
            {
                System.out.print("* ");
            }
            System.out.println(); //  for next line
        }
    }
}

