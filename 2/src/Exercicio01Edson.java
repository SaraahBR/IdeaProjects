import java.io.IOException;
import java.util.Scanner;

public class Exercicio1Edson
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int repeticao = 0;
        do
        {
            System.out.println("Digite o primeiro numero:");
            int x1 = teclado.nextInt();
            int m = x1;
            System.out.println("Digite o segundo numero:");
            int x2 = teclado.nextInt();
            if (m < x2)
                m =x2;
            System.out.println("Digite o terceiro numero:");
            int x3 = teclado.nextInt();
            if (m < x3)
                m =x3;
            if (x1 != x2 || x1 != x3)
                System.out.println("O maior numero e: " + m);
            else
            {
                System.out.println("O maior numero e: " + m+"\n");
                repeticao++;
            }
        } while (repeticao==0);
    }
}