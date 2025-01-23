import java.util.Locale;
import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int repeticao = 3;
        do
        {
            System.out.println("Nome:");
            String nome = teclado.nextLine();
            int tamanho = nome.length();
            String nomeAuxiliar = nome.toUpperCase();
            int posicao = (nome.indexOf("sa"))+1;
            System.out.println("Auxiliar:"+nomeAuxiliar);
            System.out.println("Tamanho:"+tamanho);
            System.out.println("Posicao "+posicao);
            System.out.println("Email");
            String email = teclado.nextLine();
            int confirmDolman = (email.indexOf("@"))+1;
            while (confirmDolman<1)
            {
                System.out.println("Email invalido! Por favor informe outro email");
                email = teclado.nextLine();
                confirmDolman = (email.indexOf("@"))+1;
            }
            System.out.println("Email valido!");
            repeticao--;
        } while (repeticao>0);
    }
}
            /* a) Faça a entrada de dados do email
               b) validação do email - o email deve ter @
               Email incorreto - mostre a mensagem de erro e solicite novamente
             */


