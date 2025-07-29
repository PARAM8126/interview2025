package basics01.Loops;

import java.util.Scanner;

public class TableFor
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n =  sc.nextInt();
        for(int i=n; i<=n*10;i+=n)
        {
            if(i % n ==0)
            {
                System.out.println(i);
            }
        }

    }
}
