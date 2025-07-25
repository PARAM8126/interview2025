package basics01.ControlFlow;

import ch.qos.logback.core.net.SyslogOutputStream;

public class NumberIsPositiveOrNegative {
    public static void main(String[] args) {
        int num = 16;
        if (num >= 0)
        {
            System.out.println("The num is positive");
        } else {
            System.out.println("The num is negative");
               }
    }
}
