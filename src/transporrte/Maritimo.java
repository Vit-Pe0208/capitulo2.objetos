package transporrte;

public class Maritimo extends Transporte {
    private String tipoCasco;

    public Maritimo(int capacidade,double velocidadeMaxima,String tipoCasco){
        super(capacidade, velocidadeMaxima);
        this.tipoCasco=tipoCasco;
    }
    public void setTipoCasco(String tipoCasco){
        this.tipoCasco=tipoCasco;
    }
    public String getTipoCasco(){
        return tipoCasco;
    }
    @Override
    public void exibirInformacoes(){
        System.out.println("Transporte maritimo ");
        super.exibirInformacoes();
        System.out.printf("O tipo de casco é: %s",tipoCasco);
        System.out.println();
    }


}
