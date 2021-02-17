import java.util.Scanner;

public class Espacado
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);

        while (scan.hasNext())
        {
            String palavra = scan.nextLine();
            int letras = palavra.length();
            for ( int i = 1; i<= letras; i++)
            {
                char c = palavra.charAt(i - 1);
                System.out.printf("%c%c", c, i==letras ? '\n' : ' ');
            }
        }
    }
}