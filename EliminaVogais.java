import java.util.Scanner;

public class EliminaVogais
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);

         while (scan.hasNext())
        {
            String palavra = scan.nextLine();
            String palavralimpa = "";
            int contador = 0;

            for ( int i = 0; i < palavra.length(); i++)
            {
                char c = palavra.charAt(i);
                boolean eVogal =
                    c == 'a' || c == 'A' ||
                    c == 'e' || c == 'E' ||
                    c == 'i' || c == 'I' ||
                    c == 'o' || c == 'O' ||
                    c == 'u' || c == 'U';

                if (eVogal)
                {
                    contador++;
                }

                else
                {
                    palavralimpa += c;
                }
            }

            System.out.printf("%d %s %n", contador, palavralimpa);
        }
    }
}