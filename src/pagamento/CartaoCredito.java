package pagamento;
public class CartaoCredito extends Pagamento{
    private double taxa;

    public CartaoCredito(double valor,double taxa){
        super(valor);
        this.taxa=taxa;
    }
    public void setTaxa(double taxa){
        this.taxa=taxa;
    }
    public double getTaxa(){
        return taxa;
    }
    @Override
    public void realizarPagamento(){
        System.out.println("Cartão de Crédito");
        super.realizarPagamento();
        System.out.printf("Exibir Taxa: %.2f%n ",getTaxa(),"%");
        System.out.println();
        
    }



}
