import java.util.Scanner;

public class Meses
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);
        int M = scan.nextInt();

        if (M >= 1 && M <=12)
        {
           if (M == 1)
           {
               System.out.println("JANEIRO");
           }

           if (M == 2)
           {
               System.out.println("FEVEREIRO");
           }

           if (M == 3)
           {
               System.out.println("MARCO");
           }

           if (M == 4)
           {
               System.out.println("ABRIL");
           }

           if (M == 5)
           {
               System.out.println("MAIO");
           }

           if (M == 6)
           {
               System.out.println("JUNHO");
           }

           if (M == 7)
           {
               System.out.println("JULHO");
           }

           if (M == 8)
           {
               System.out.println("AGOSTO");
           }

           if (M == 9)
           {
               System.out.println("SETEMBRO");
           }

           if (M == 10)
           {
               System.out.println("OUTUBRO");
           }

           if (M == 11)
           {
               System.out.println("NOVEMBRO");
           }

           if (M == 12)
           {
               System.out.println("DEZEMBRO");
           }
        }

        else
        {
            System.out.println("MES INVALIDO");
        }
    }
}