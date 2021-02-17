import java.util.Scanner;

public class SelectionSort
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

        for( int i = 0; i < n; i++)
        {
            int min = i;

            for( int j = i + 1; j < n; j++)
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
        for (int i = 0; i < n; i++)
        {
            System.out.printf("%d%c",v[i], (i == (n - 1)) ? '\n' : ' ');
        }
    }
}
