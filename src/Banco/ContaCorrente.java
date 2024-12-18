package Banco;

public class ContaCorrente extends ContaBancaria{
    private double limite;

    public ContaCorrente(String numero,double saldo,double limite){
        super(numero, saldo);
        this.limite=limite;
    }
    public void setLimite(double limite){
        this.limite=limite;
    }
    public double getLimite(){
        return limite;
    }
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.printf(" e o limite da conta é %.2f%n", limite);
    }
         


}
