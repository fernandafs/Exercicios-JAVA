import java.util.Scanner;

public class Datas
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);
        int teste = scan.nextInt();
        int i = 0;
        String j; String k;
        j = "";
        k = "";

        while (i < (teste))
        {
            i = i + 1;
            int d = scan.nextInt();
            int m = scan.nextInt();
            int a = scan.nextInt();

            int d1 = a%400;
            int d2 = a%100;
            int d3 = a%4;

            if (d == 31 && (m == 4 | m == 6 || m == 9 || m == 11))
            {
                j = "DATA INVALIDA";
            }

            else if (m == 2 && (d1 != 0 || d2 == 0 && d3 != 0) && d == 29)
            {
                j = "DATA INVALIDA";
            }

            else if (m == 2 && (d == 30 || d == 31))
            {
                j = "DATA INVALIDA";
            }

            else
            {
               k = "DATA VALIDA";
            }
        }
        
        System.out.println(j);
        System.out.println(k);
    }
}