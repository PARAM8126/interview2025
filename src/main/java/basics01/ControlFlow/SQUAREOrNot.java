package basics01.ControlFlow;

import java.util.Scanner;

public class SQUAREOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length :");
        int length = sc.nextInt();
        System.out.println("Enter the breadth :");
        int breadth = sc.nextInt();

        if(length == breadth){
            System.out.println("The given rectangle is a SQUARE ");
        }else {
            System.out.println("The given rectangle is a not SQUARE ");
        }


    }

}
