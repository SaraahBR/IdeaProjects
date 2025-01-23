public class Conta
{
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular)
    {
        this.numero=numero;
        this.titular=titular;
    }

    public void depositar(double valor)
    {
        this.saldo=this.saldo+valor;
    }
    public void sacar(double valor)
    {
        this.saldo=this.saldo-valor;
    }
    public double getSaldo()
    {
        return this.saldo;
    }

    public String getTitular()
    {
        return this.titular;
    }
    public int getNumero()
    {
        return this.numero;
    }
    public void setTitular(String novoTitular)
    {
        this.titular=novoTitular;
    }
}