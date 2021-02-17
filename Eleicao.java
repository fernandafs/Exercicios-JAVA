import java.util.Scanner;

public class Eleicao
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);

        int voto;int nulo; int branco; int chapa1; int chapa2; int chapa3;
        nulo = 0;
        branco = 0;
        chapa1 = 0;
        chapa2 = 0;
        chapa3 = 0;
        voto = 0;


        while (voto != -1)
        {
            voto = scan.nextInt();

            if (voto > 3)
            {
             nulo = nulo + 1;
            }

            if (voto == 0)
            {
                branco = branco + 1;
            }

            if (voto == 1)
            {
                chapa1 = chapa1 + 1;
            }

            if (voto == 2)
            {
                chapa2 = chapa2 + 1;
            }

            if (voto == 3)
            {
                chapa3 = chapa3 + 1;
            }
        }

        System.out.println("Votos chapa 1: " + chapa1);
        System.out.println("Votos chapa 2: " + chapa2);
        System.out.println("Votos chapa 3: " + chapa3);
        System.out.println("Votos brancos: " + branco);
        System.out.println("Votos nulos  : " + nulo);

        if (chapa3 > chapa2 && chapa3 > chapa1)
        {
            System.out.println("==Vitoria chapa 3==");
        }

        else if (chapa2 > chapa3 && chapa2 > chapa1)
        {
            System.out.println("==Vitoria chapa 2==");
        }

        else if (chapa1 > chapa2 && chapa1 > chapa3)
        {
            System.out.println("==Vitoria chapa 1==");
        }

        else
        {
            System.out.println("==Empate==");
        }
    }
}


