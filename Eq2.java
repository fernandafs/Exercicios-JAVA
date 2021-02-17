import java.util.Scanner; import java.text.DecimalFormat;

public class Eq2
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);
        double a = scan.nextFloat(); double b = scan.nextFloat(); double c = scan.nextFloat();
        double delta = (b*b) - (4*a*c);
        double raiz = Math.sqrt(delta);
        double xp = (-(b) + raiz)/(2*a);
        double xn = (-(b) - raiz)/(2*a);
        DecimalFormat formatador = new DecimalFormat("0.0000");

        System.out.println (formatador.format(xp) + " " + formatador.format(xn));
    }
}