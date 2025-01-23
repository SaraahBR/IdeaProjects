import java.util.Scanner;

public class AtividadeEedson
        public static void main(String[] args) {

            Scanner opcao = new Scanner(System.in);

            int dificuldade;

            System.out.println("Escolha a o nivel!");
            System.out.println("1 - Facíl");
            System.out.println("2 - Normal");
            System.out.println("3 - Díficil");
            dificuldade = opcao.nextInt();
            switch (dificuldade)
            {
                case 1:
                    Facil();
                    System.out.println();
                    break;
                case 2:
                    Normal();
                    System.out.println();
                    break;
                case 3:
                    Dificil();
                    System.out.println();
                    break;
            }

        }
        public static void Facil() {
            System.out.println("Facil");
            Scanner teclado = new Scanner(System.in);
            int sorteio = 1 + (int) (Math.random() * 1000);
            int palpite;
            boolean achou = false;

            for (int i=0; i<=15; i++)
            {
                System.out.println("palpite:");
                palpite = teclado.nextInt();
                if (palpite == sorteio)
                {
                    System.out.println("Parabéns! Você acertou com " + i + " tentativas");
                    achou = true;
                    break;
                }
                else
                {
                    if (palpite < sorteio){
                        System.out.println("Palpite Baixo");
                    }
                    else
                    {
                        System.out.println("Paltite Alto");
                    }

                }
            }
            if (achou == false)
            {
                System.out.println("O numero sorteado foi: " + sorteio + "Tente Novamente");
            }
        }

        public static void Normal() {
            System.out.println("Normal");
            Scanner teclado = new Scanner(System.in);
            int sorteio = 1 + (int) (Math.random() * 5000);
            int palpite;
            boolean achou = false;

            for (int i=0; i<=12; i++)
            {
                //System.out.println("i=" + i + " " + Math.random());
                System.out.println("palpite:");
                palpite = teclado.nextInt();
                if (palpite == sorteio)
                {
                    System.out.println("Parabéns! Você acertou com " + i + " tentativas");
                    achou = true;
                    break;
                }
                else
                {
                    if (palpite < sorteio){
                        System.out.println("Palpite Baixo");
                    }
                    else
                    {
                        System.out.println("Paltite Alto");
                    }

                }
            }
            if (achou == false)
            {
                System.out.println("O numero sorteado foi: " + sorteio + "Tente Novamente");
            }
        }

        public static void Dificil() {
            System.out.println("Dificil");
            Scanner teclado = new Scanner(System.in);
            int sorteio = 1 + (int) (Math.random() * 10000);
            int palpite;
            boolean achou = false;

            for (int i=0; i<=10; i++)
            {
                //System.out.println("i=" + i + " " + Math.random());
                System.out.println("palpite:");
                palpite = teclado.nextInt();
                if (palpite == sorteio)
                {
                    System.out.println("Parabéns! Você acertou com " + i + " tentativas");
                    achou = true;
                    break;
                }
                else
                {
                    if (palpite < sorteio){
                        System.out.println("Palpite Baixo");
                    }
                    else
                    {
                        System.out.println("Paltite Alto");
                    }

                }
            }
            if (achou == false)
            {
                System.out.println("O numero sorteado foi: " + sorteio + "Tente Novamente");
            }
        }
    }
}
