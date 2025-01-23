import java.util.Scanner;

public class Exercicio05Edson
{
    public static void main(String[] args)
    {
        int x=0;
        int y=0;
        System.out.println("Parquimetro");
        Scanner t=new Scanner(System.in);
        while(x>=0)
        {
            System.out.println("Quanto tempo ficou estacionado?");
            x= t.nextInt();
            if(x<=15)
                System.out.println("Isento de pagamento");
            else if (x>15&&x<=60)
                System.out.println("Deve pagar R$1,50");
            else if (x>60)
            {
                y=(x/60+1);
                if(x%60!=0)
                    System.out.println("Deve pagar R$"+y+",50");
                else
                    System.out.println("Deve pagar R$"+(y-1)+",50");
            }
        }
    }
}