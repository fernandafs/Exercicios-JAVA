import java.util.Scanner;

public class Idade
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);
        int anoat = scan.nextInt(); String nome = scan.next(); int ano = scan.nextInt();
        int idade = anoat-ano;
        System.out.println(nome + ", voce completa " + idade + " anos de idade neste ano.");
    }
}