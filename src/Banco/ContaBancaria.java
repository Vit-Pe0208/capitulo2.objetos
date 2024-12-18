package Banco;

public class ContaBancaria {
    private String numero;
    private double saldo;

    public ContaBancaria(String numero,double saldo){
        this.numero=numero;
        this.saldo=saldo;
    }
    public void setNumero(String numero){
        this.numero=numero;
    }
    public String getNumero(){
        return numero;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    public  void exibirDetalhes(){
        System.out.printf("%s tem saldo de %.2f", numero,saldo);
    }

}
