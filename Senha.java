import java.util.Scanner;

public class Senha
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);
        String numero = scan.next(); 
        int d1 = (numero.charAt(0)=='0')? 0:1;
        int d2 = (numero.charAt(1)=='0')? 0:1;
        int d3 = (numero.charAt(2)=='0')? 0:1;
        int d4 = (numero.charAt(3)=='0')? 0:1;
        int d5 = (numero.charAt(4)=='0')? 0:1;
        int d6 = (numero.charAt(5)=='0')? 10:10;
        int soma = d1+d2+d3+d4+d5;

        if (soma == 4)
        {
            System.out.println("SIM");
        }
        else
        {
            System.out.println("NAO");
        }
    }
}