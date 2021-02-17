import java.util.Scanner; import java.text.DecimalFormat;

public class CachorrosQuentes
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);

        float total = scan.nextInt(); float part = scan.nextInt();

        float media = (total/part);

        DecimalFormat formatador = new DecimalFormat("0.00");

        System.out.println(formatador.format(media));
    }
}

