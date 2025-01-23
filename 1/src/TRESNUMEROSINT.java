import java.util.Scanner;

public class TRESNUMEROSINT {


    public class Principal {

        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            int a;
            int b;
            int c;

            System.out.print("Primeiro valor inteiro: ");
            a = ler.nextInt();
            System.out.print("Segundo valor inteiro: ");
            b = ler.nextInt();
            System.out.print("Terceiro valor inteiro: ");
            c = ler.nextInt();

            if(a < b){
                if(b < c){
                    System.out.println(a+"\n"+b+"\n"+c);
                }
            }else if(a < c){
                System.out.println(a+"\n"+c+"\n"+b);
            }else{
        System.out.println(c+"\n"+a+"\n"+b);
        }
    }
    else if(b < c){
    if (a < c){
        System.out.println(b+"\n"+a+"\n"+c);
    }

    }
    }

}
