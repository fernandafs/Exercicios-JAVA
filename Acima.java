import java.util.Scanner;

public class Acima
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);

        int C = scan.nextInt();

        for( int i = 0; i < C; i++)
        {
            int n = scan.nextInt();
            int notas[] = new int[n];
            double media = 0;
            for(int j = 0; j < n; j++)
            {
                notas[j] = scan.nextInt();
                media += notas[j];
            }
            media /= n;
            int contagem = 0;

            for(int j = 0; j < n; j++)
            {
                if (notas[j] > media)
                {
                    contagem ++;
                }
            }
            double percent = (double)contagem/n * 100;

            System.out.printf("%.3f%%%n", percent);
        }

    }
}