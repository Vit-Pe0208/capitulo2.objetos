package pagamento;
public class Boleto extends Pagamento{
    private double desconto;

    public Boleto(double valor,double desconto){
        super(valor);
        this.desconto=desconto;
    }
    public void setDesconto(double desconto){
        this.desconto=desconto;
    }
    public double getDesconto(){
        return desconto;
    }
    @Override
    public void realizarPagamento(){
        System.out.println("Boleto");
        super.realizarPagamento();
        System.out.printf("Exibir desconto:R$ %.2f%n",getDesconto());
        System.out.println();
        
    }

}
