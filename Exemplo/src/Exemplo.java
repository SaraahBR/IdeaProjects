import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matricula;
        double valorSalario, total = 0, maior = 0, menor = 0;
        for (int i=0; i<3; i++) {

            System.out.println("Matricula");
            matricula = entrada.nextInt();
            System.out.println("Salario");
            valorSalario = entrada.nextDouble();
            total = total + valorSalario;
            if (i == 0) {
                maior = valorSalario;
            } else {
                if (valorSalario > maior) {
                    maior = valorSalario;
                }
            }
            if (i == 0) {
                menor = valorSalario;
            } else {
                if (valorSalario < menor) {
                    menor = valorSalario;
                }
            }
        } } }