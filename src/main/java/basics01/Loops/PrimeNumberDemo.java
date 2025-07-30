package basics01.Loops;

import java.util.Scanner;

public class PrimeNumberDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        boolean isPrime = false; // false mean prime
        for(int i =2; i<n;i++)
        {
            if(n%i==0) // i is factor
            {
                isPrime = true; // true means composite
                break;
            }
        }
        if(isPrime==false)
        {
            System.out.println(" Prime Number.");
        }
        else
        {
            System.out.println(" composite  Number.");
        }
    }
}

