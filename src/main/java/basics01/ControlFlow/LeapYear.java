package basics01.ControlFlow;
//1. A year is a leap year if it is divisible by 4,
// 2.except for years that are divisible by 100 but not by 400
public class LeapYear {
    public static void main(String[] args) {
        int year = 2016;

        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    System.out.println("leap year");
                } else {
                    System.out.println("not leap year");
                }
            } else {
                System.out.println("leap year");
            }
        } else {
            System.out.println("not leap year");
        }
    }
}
