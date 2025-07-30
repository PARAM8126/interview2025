package basics01.Pattern;

import java.util.Scanner;

public class AlphabetsSquareDemo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            for(int j =1;j<=n;j++)
            {
                System.out.print( (char)(i+64)+ " ");
            }
            System.out.println();
        }
    }
    // output
   // Enter n
  //6
  //  A A A A A A
  //  B B B B B B
 //   C C C C C C
 //   D D D D D D
  //  E E E E E E
 //   F F F F F F

}
