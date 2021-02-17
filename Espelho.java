import java.util.Scanner;

public class Espelho
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);

        String num1 = scan.next(); String num2 = scan.next();
        int d1 = (num1.charAt(0));
        int d2 = (num1.charAt(1));
        int d3 = (num1.charAt(2));
        int d4 = (num1.charAt(3));

        int d5 = (num2.charAt(0));
        int d6 = (num2.charAt(1));
        int d7 = (num2.charAt(2));
        int d8 = (num2.charAt(3));

        if ((d1 == d8) && (d2 == d7) && (d3 == d6) && (d4 == d5))
        {
            System.out.println("espelho");
        }
        else
        {
            System.out.println("nao espelho");
        }
    }
}