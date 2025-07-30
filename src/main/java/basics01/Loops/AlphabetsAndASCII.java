package basics01.Loops;

public class AlphabetsAndASCII
{
    public static void main(String[] args)
    {
        for(int i = 65;i<=90;i++)
        {
            char ch = (char) i;  // convert ASCII to character
            System.out.println(ch + " " + i);
        }
    }
}
