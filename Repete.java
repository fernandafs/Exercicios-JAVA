import java.util.Scanner;

public class Repete
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

        boolean acheiRepet = false;
        for( int i = 0; i < n && !acheiRepet; i++)
        {
            for (int j = i + 1; j< n; j++)
            {
                if (v[i] == v[j])
                {
                    acheiRepet = true;
                    break;
                }
            }
        }
        if (acheiRepet)
        {
        System.out.println("S");
        }
        else
        {
            System.out.println("N");
        }
    }
}

