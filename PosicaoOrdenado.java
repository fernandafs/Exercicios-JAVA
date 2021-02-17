import java.util.Scanner;

public class PosicaoOrdenado
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);

        int n = scan.nextInt();
        int v[] = new int [n];

        for(int i = 0; i < n; i++)
        {
            v[i]= scan.nextInt();
        }

        int x = scan.nextInt();
        int menores = 0;

        for(int i = 0; i < n; i++)
        {
            if (v[i] < x)
            {
                menores++;
            }
        }
        System.out.println(menores);
    }
}
