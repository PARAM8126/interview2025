package basics01.Pattern;

import java.util.Scanner;

public class FloydsTriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int a = 1;
         for(int i = 1; i<=n;i++)
        {

            for(int j=1;j<=i ;j++)
                {
                    System.out.print(a + " ");
                      a++;
                  /*  a += 2;
                    Enter the number :
                    4
                    1
                    3 5
                    7 9 11
                    13 15 17 19 */
                }

            System.out.println();
        }
    }
}

// output
//Enter the number :
//4
//1
//2 3
//4 5 6
//7 8 9 10