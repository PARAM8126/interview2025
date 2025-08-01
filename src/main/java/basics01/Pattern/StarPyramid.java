package basics01.Pattern;

import java.util.Scanner;

public class StarPyramid
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ");
        int n = sc.nextInt();

        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-i;j++) //space loop
            {
                System.out.print(" " + " ");
            }for(int j =1; j<=2*i-1;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

// output
//Enter the value
//5
//        *
//      * * *
//    * * * * *
//  * * * * * * *
//* * * * * * * * *