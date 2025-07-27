package basics01.ControlFlow;

import java.lang.invoke.MutableCallSite;
import java.util.Scanner;

public class JobEligibilityChecker
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter your degree (e.g. BTech, MCA): ");
        String degree = sc.nextLine();

        System.out.print("Enter your years of experience: ");
        int experience = sc.nextInt();

        if (age >= 18) {
            if  (degree.equals("MCA") || degree.equals("BTech")
) {
                if (experience >= 2) {
                    System.out.println(" You are eligible for the job.");
                } else {
                    System.out.println(" Not enough experience.");
                }
            } else {
                System.out.println(" Invalid degree.");
            }
        } else {
            System.out.println(" Underage – not eligible.");
        }
    }
}

