package transporrte;

public class Terrestre extends Transporte {
    private String tipoCombustivel;

    public Terrestre(int capacidade,double velocidadeMaxima,String tipoCombustivel){
        super(capacidade, velocidadeMaxima);
        this.tipoCombustivel=tipoCombustivel;
    }

    public void setTipoCombustível(String tipoCombustivel){
        this.tipoCombustivel=tipoCombustivel;
    }
    public String getTipoCombustivel(){
        return tipoCombustivel;
    }
    @Override
    public void exibirInformacoes(){
        System.out.println("Transporte terrestre ");
        super.exibirInformacoes();
        System.out.printf("Tipo de combustível: %s%n",tipoCombustivel);
        System.out.println();

    }



}
