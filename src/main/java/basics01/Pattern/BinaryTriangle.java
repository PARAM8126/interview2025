package basics01.Pattern;

import java.util.Scanner;

public class BinaryTriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for(int i=1; i<=n;i++)
        {
            for(int j = 1; j<=i;j++)
            {
              if(i%2==1)
              {
                  if(j%2==1)
                  {
                      System.out.print(1 + " ");
                  }else {
                      System.out.print(0 + " ");
                  }
              }else //(i%2==0)
                  {
                    if(j%2==0)
                    {
                        System.out.print(1 + " ");
                    }else
                    {
                        System.out.print(0 + " ");
                    }
                  }


            }
            System.out.println();
        }
    }
}
//output
//Enter the number :
//6
//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1
//0 1 0 1 0 1