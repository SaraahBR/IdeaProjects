import java.util.Scanner;

public class UsaConta
{
    public static void main(String[] args)
    {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Titular");
        String titular = teclado.nextLine();
        System.out.println("Numero");
        int numero = teclado.nextInt();
        Conta conta = new Conta(numero,titular);

        //teste os métados da classe Conta

        int opcao = 0;
        double valor;
        while (opcao != 9)
        {
            System.out.println("1- Ver o saldo");
            System.out.println("2- Depositar");
            System.out.println("3- Sacar");
            System.out.println("4- Alterar o titular");
            System.out.println("9- Fim");
            opcao = teclado.nextInt();
            switch (opcao)
            {
                case 1 :
                    System.out.println("Numero:" + conta.getNumero());
                    System.out.println("Titular:" + conta.getTitular());
                    System.out.println("Saldo:" + conta.getSaldo());
                    break;
                case 2 :
                    System.out.println("Valor do Deposito: ");
                    valor = teclado.nextInt();
                    conta.depositar(valor);
                    break;
                case 3 :
                    System.out.println("Valor do Saque: ");
                    valor = teclado.nextInt();
                    conta.depositar(valor);
                    break;
                case 4 :
                    System.out.println("Novo titular:");
                    titular = teclado.nextLine();
                    conta.setTitular(titular);
                    break;
                case 9 :
                    System.out.println("Finalizado com sucesso");
                default:
                    System.out.println("Opção incorreta");
                    break;
            }
        }


        System.out.println("Saldo:" +conta.getSaldo());
        conta.depositar(100);
        System.out.println("Saldo: "+conta.getSaldo());
    }
}