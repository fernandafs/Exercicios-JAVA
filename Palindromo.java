import java.util.Scanner;

public class Palindromo
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);

        while (scan.hasNext())
        {
            String palavra = scan.nextLine();
            int tam = palavra.length();
            boolean palindromo = true;

            for (int i = 0; i < tam && palindromo; i++)
            {
                boolean comparacao = palavra.charAt(i) == palavra.charAt(tam - 1 - i);
                palindromo &= comparacao;
            }

            if (palindromo)
            {
                System.out.println("sim");
            }
            else
            {
                System.out.println("nao");
            }
        }
    }
}
