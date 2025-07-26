package basics01.ControlFlow;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cp: ");
        int Cp = sc.nextInt();
        System.out.println("Enter the Sp :");
        int Sp = sc.nextInt();

        if(Sp>Cp) // Profit
        {
            System.out.println("you profit is :");
            int Profit = Sp - Cp;
            System.out.println(Profit);
        }else // Loss
        {
            System.out.println("ypur Loss is :");
            int Loss = Cp - Sp;
            System.out.println(Loss);
        }

    }
}
