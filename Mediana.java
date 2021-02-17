import java.util.Scanner;

public class Mediana
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);

        int num = scan.nextInt();
        int v[] = new int [num];

        for(int i = 0; i < num; i++)
        {
            v[i]= scan.nextInt();
        }

        for( int i = 0; i < num; i++)
        {
            int min = i;

            for( int j = i + 1; j < num; j++)
            {
                if( v[j] < v[min])
                {
                    min = j;
                }
            }

            int tmp = v[i];
            v[i] = v[min];
            v[min] = tmp;
        }

        double mediana;
        if ( num % 2 == 0)
        {
            mediana = (double)(v[num / 2] + v[num / 2 - 1]) / 2;
        }
        else
        {
            mediana = v[ num / 2];
        }

        System.out.printf("%.2f%n", mediana);
    }
}