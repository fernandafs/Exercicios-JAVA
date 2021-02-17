import java.util.Scanner;

public class Cha
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);

        int cha = scan.nextInt();

        int i = 0;
        int ponto = 0;

        while ( i < 5)
        {
            int r = scan.nextInt();

            if ( r == cha)
            {
                ponto++;
            }

            i++;
        }

        System.out.println(ponto);
    }
}



