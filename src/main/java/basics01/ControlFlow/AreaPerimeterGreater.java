package basics01.ControlFlow;

import java.util.Scanner;

public class AreaPerimeterGreater
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length :" );
        int length = sc.nextInt();
        System.out.println("Enter the breadth : ");
        int breadth = sc.nextInt();

        int Area = length * breadth;
        int Perimete = 2  * (length + breadth);

         if(Area>Perimete)
         {
             System.out.println("Area is greater the perimeter ");
         }else if(Perimete>Area)
         {
             System.out.println("preimeter is greater than Area");
         } else
         {
             System.out.println("preimeter  and Area are equal");
         }


    }
}
