import java.util.Scanner;

public class Exemploo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String nome1, nome2;
        System.out.println("Quantidade de repetição");
        int repeticao = teclado.nextInt();
                while (repeticao > 0){
                    System.out.println(repeticao);
                    System.out.println("Numero:");
                   numero = teclado.nextInt();
                   teclado.nextLine();
                   // % operador de resto da divisão
                   if (numero % 2 == 0) {
                       System.out.println(numero + " é par");
                   }else {
                       System.out.println(numero + "é impar");

                   }
                   System.out.println("Nome 1");
                   nome1 = teclado.nextLine();
                   System.out.println("Nome 2");
                   nome2 = teclado.nextLine();
                   // metodo equals compara o conteudo da String
                   if (nome1.equals(nome2)){
                       System.out.println("Nomes iguais");
                   }else{
                       System.out.println("Nomes diferentes");
                   }
                   if (nome1.equals("Unifil")){
                       System.out.println("Unifil Computação");

                   }
                       repeticao--;  //-- decrementa uma unidade
                }
    }
}
