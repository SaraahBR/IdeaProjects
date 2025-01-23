import java.util.Scanner;

public class Exercicio04Edson
{
    public static void main(String[] args)
    {
        Scanner t=new Scanner(System.in);
        int i=1;
        while(i==1)
        {
            double m4=0.0;
            double m3 = 0.0;
            double de = 0.0;
            double p = 0.0;
            System.out.println("Calculo de IPTU");
            System.out.println("Nome do proprietario:");
            String nome= t.nextLine();
            nome=nome.substring(0,1).toUpperCase().concat(nome.substring(1));
            System.out.println("Metragem do terreno (metros quadrados):");
            double m= t.nextInt();
            double m2 = m * 1.10;
            System.out.println("O imovel de esquina?\n 1-SIM  2-NAO");
            int e= t.nextInt();
            if(e==1)
            {
                m3 = m * 0.20;
            }
            System.out.println("Terreno comercial?\n 1-SIM  2-NAO");
            int c= t.nextInt();
            if(c==1)
            {
                m4=m*0.10;
            }
            double m5= m2+m3+m4;
            System.out.println("Terreno limpo?\n 1-SIM  2-NAO");
            int d=t.nextInt();
            if(d==1)
            {
                de = m5 * 0.25;
            }

            System.out.println("\n\nIPTU");
            System.out.println("Proprietario: "+nome);
            System.out.println("Metragem do terreno: "+m+" metros quadrados");
            System.out.println("OBS:");
            if(e==1)
                System.out.println("\tTerreno na esquina");
            if(c==1)
                System.out.println("\tTerreno comercial");
            if(d==1)
                System.out.println("\tTerreno limpo");

            System.out.printf("\nTaxa por metro quadrado:\t\t\tR$%.2f",(m2));
            if(e==1)
                System.out.printf("\nTaxa de esquina:\t\t\t\t\tR$%.2f",(m3));
            if(c==1)
                System.out.printf("\nTaxa comercial: \t\t\t\t\tR$%.2f",(m4));
            if(d==1)
                System.out.printf("\nDesconto por terreno limpo: \t\t-R$%.2f",(de));

            System.out.printf("\nValor a ser pago:\t\t\t\t\tR$%.2f",(m5-de));
            System.out.println("\nGostaria de refazer?\n 1-SIM  2-NAO");
            i=t.nextInt();
            t.nextLine();
        }
    }
}