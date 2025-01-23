import java.io.IOException;
import java.util.Scanner;

public class Exercicio2Edson
{
    private static String t1,t2;
    private static int x1=0,x2=0,x3=0;

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nome do primeiro time:");
        t1 = teclado.nextLine();
        System.out.println("Nome do segundo time:");
        t2 = teclado.nextLine();
        t1=t1.substring(0,1).toUpperCase().concat(t1.substring(1));
        t2=t2.substring(0,1).toUpperCase().concat(t2.substring(1));
        int i = 0;
        while(i==0)
        {
            Scanner opcao = new Scanner(System.in);
            int op;
            System.out.println("Menu\n");

            System.out.println("1-Aplicar pesquisa");
            System.out.println("2-Mostrar resultado");
            System.out.println("9-Fim");

            System.out.println("Ex:");
            op = opcao.nextInt();
            switch (op)
            {
                case 1:
                    ap();
                    System.out.println("\n");
                    break;
                case 2:
                    mo();
                    System.out.println("\n");
                    break;
                case 9:
                    i++;
                    break;

                default:
                    System.out.println("Opcao invalida\n");
            }
        }
    }
    public static void ap()
    {
        int j = 0;
        while (j == 0)
        {
            int v;
            Scanner opcao = new Scanner(System.in);

            System.out.println("1-" + t1 + " venceu");
            System.out.println("2-" + t2 + " venceu");
            System.out.println("3-Empate");
            System.out.println("9-Sair\n");

            System.out.println("Opcao:");
            v = opcao.nextInt();
            if(v==1)
                x1++;
            else if(v==2)
                x2++;
            else if(v==3)
                x3++;
            else if(v==9)
                j++;
            else
                System.out.println("Voto invalido");
        }
    }
    public static void mo() throws IOException
    {
        System.out.println("PLACAR:\n");
        System.out.println(t1+" teve "+x1+" votos");
        System.out.println(t2+" teve "+x2+" votos");
        System.out.println("Teve "+x3+" empates\n");
        System.out.println("Precione enter para retornar");
        System.in.read();
    }
}