package basics01.ControlFlow;

import java.util.Scanner;

public class NestedLargestOfThree
{
    public static void main(String[] args)
    {
        Scanner sc = new  Scanner (System.in);
        System.out.println("Enter the first number");
        int a  = sc.nextInt();
        System.out.println("Enter the Second number");
        int b  = sc.nextInt();
        System.out.println("Enter the Third number");
        int c  = sc.nextInt();

        if(a>b){
                if (a>c){
                    System.out.println(a+ "is the largest");
                }else{ // a<c   --> b<a<c
                    System.out.println(c+ "is the largest");
                }

        }else{ // a<b
            if(b>c){
                System.out.println(b+ "is the largest");
            }else{ // b<c ---> a<b<c
                System.out.println(c+ "is the largest");
            }
        }
    }
}

