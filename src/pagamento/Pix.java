package pagamento;
public class Pix extends Pagamento{
    private double valorTransferencia;

    public Pix(double taxa,double valorTransferencia){
        super(taxa);
        this.valorTransferencia=valorTransferencia;
    }
    public void setValorTransferencia(double valorTransferencia){
        this.valorTransferencia=valorTransferencia;
    }
    public double getValorTransferencia(){
        return valorTransferencia;
    }
    @Override
    public void realizarPagamento(){
        System.out.println("Pix");
        super.realizarPagamento();;
        System.out.printf("Exibir valor da Tranferencia: R$ %.2f%n",getValorTransferencia());
        System.out.println();
        
    }


}
