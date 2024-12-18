package Banco;

public class ContaPoupanca extends ContaBancaria{
    private double taxaDeJuros;

    public ContaPoupanca(String numero,double saldo,double taxaDeJuros){
        super(numero, saldo);
        this.taxaDeJuros=taxaDeJuros;
    }
    public void setTaxaDeJuros(double taxaDeJuros){
        this.taxaDeJuros=taxaDeJuros;
    }
    public double getTaxaDeJuros(){
        return taxaDeJuros;
    }
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.printf(" e a  taxa de juros é %.2f%n",taxaDeJuros);
    }

}
