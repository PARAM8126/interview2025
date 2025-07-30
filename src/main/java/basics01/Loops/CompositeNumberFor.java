package basics01.Loops;

import java.util.Scanner;

public class CompositeNumberFor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n =  sc.nextInt();
        for(int i = 2;i<n; i++)
        {
           if(n%i==0){
               System.out.println(n+ "composit Number");
               break;
           }
        }
    }

}
