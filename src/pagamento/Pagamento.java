package pagamento;
public class Pagamento{
    private double valor;

    public Pagamento(double valor){
        this.valor=valor;
    }
    public void setValor(double valor){
        this.valor=valor;
    }
    public double getvalor(){
        return valor;
    }
    public void realizarPagamento(){
        System.out.printf("Pagamento: %.2f%n",getvalor());
    }

}
