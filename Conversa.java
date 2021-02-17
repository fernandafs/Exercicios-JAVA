import java.util.Scanner;

public class Conversa
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++)
        {
            int pessoas = Integer.parseInt(scan.nextLine());
            String lingua1 = scan.nextLine();

            boolean todosiguais = lingua1.equals(scan.nextLine());

            for (int j = 2; j < pessoas; j++)
            {
                todosiguais &= scan.nextLine().equals(lingua1);
            }

            if(todosiguais)
            {
            System.out.println (lingua1);
            }

            else
            {
                System.out.println("ingles");
            }
        }
    }
}
