import java.util.Scanner;

public class Lua
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);

        int lua1 = scan.nextInt(); int lua2 = scan.nextInt();

        if (lua2 <= 2)
        {
            System.out.println("Nova");
        }

        if (lua2 >= 97)
        {
            System.out.println("Cheia");
        }

        if (lua2 < 97 && lua2 > 2)
        {
            if (lua1 > lua2)
            {
                System.out.println("Minguante");
            }

            if (lua1 < lua2)
            {
                System.out.println("Crescente");
            }
        }
    }
}