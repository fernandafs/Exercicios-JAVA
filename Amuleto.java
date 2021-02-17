import java.util.Scanner;

public class Amuleto
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);

        while (scan.hasNext())
        {
            String palavra = scan.nextLine();
            int letras = palavra.length();

            int i = 1;
            String espacos = " ";

            while (letras != 0)
            {
                i = i/i;

                while(i<=letras)
                {
                    char c = palavra.charAt(i - 1);
                    System.out.printf("%c%c", c, i == letras ? '\n' : ' ');
                    i++;
                }

                if (letras != 1)
                {
                    System.out.printf("%s",espacos);
                }

                letras = letras - 1;
                espacos = espacos + " ";
            }

            System.out.println();
        }
    }
}





