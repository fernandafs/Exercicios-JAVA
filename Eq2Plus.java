import java.util.Scanner;
import java.text.DecimalFormat;

public class Eq2Plus
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);
        double A = scan.nextFloat(); double B = scan.nextFloat(); double C = scan.nextFloat();
        double delta = (B*B) - (4*A*C);
        double raiz = Math.sqrt(delta);

        if (raiz >= 0)
        {
            double xp = (-(B) + raiz)/(2*A);
            double xn = (-(B) - raiz)/(2*A);
            DecimalFormat formatador = new DecimalFormat("0.0000");

            if (xp == xn)
            {
                System.out.println(formatador.format(xp));
            }

            else
            {
                System.out.println(formatador.format(xp) + " " + formatador.format(xn));
            }
        }
        else
        {
            System.out.println("nao ha raiz real");
        }
    }
}