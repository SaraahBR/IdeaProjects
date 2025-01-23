import java.util.Scanner;

public class AdivinharNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sorteio = 1 + (int) (Math.random() * 100);
        System.out.println("Sorteio: " + sorteio);
        int palpite;

        for (int i = 0; i <= 10; i++)
        {
            //System.out.println("i=" + i + " " + Math.random());
            System.out.println("palpite: ");
            palpite = teclado.nextInt();
            if (palpite == sorteio)
            {
                System.out.println("Parabéns");
                break; //finaliza o laço de repetição
            }else{
                if (palpite < sorteio){
                    System.out.println("Palpite baixo");
                }else{
                    System.out.println("Palpite alto");
                }
        }

    }
    }
}
