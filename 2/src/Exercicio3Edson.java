import static java.lang.Thread.sleep;

public class Exercicio3Edson
{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("10:00");
        sleep(1000);
        for (int x1=9;x1>=0; x1--)
        {
            for (int x2=59;x2>=0;x2--)
            {
                if(x2<10)
                    System.out.println("0"+x1+":0"+x2);
                else
                    System.out.println("0"+x1+":"+x2);
                sleep(1000);
            }
        }
    }
}