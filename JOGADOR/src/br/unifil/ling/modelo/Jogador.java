package br.unifil.ling.modelo;

import java.util.Scanner;

public class Jogador {
    public static void main(String[] args)
    {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Nome");
        String titular = teclado.nextLine();
        System.out.println("Numero");
        int numero = teclado.nextInt();
        Jogador jogador = new Jogador(numero,titular);

        int opcao = 0;
        double valor;
}
