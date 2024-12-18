package veiculo;

public class Carro extends Veiculo {
    private double consumoPorKm;

    public Carro(String modelo,double capacidadeTanque,double consumoPorKm){
        super(modelo, capacidadeTanque);
        this.consumoPorKm=consumoPorKm;
    }
    public double getConsumoPorKm(){
        return consumoPorKm;
    }
    public void setConsumoPorKm(double consumoPorKm){
        this.consumoPorKm=consumoPorKm;
    }
    @Override
    public void Detalhes(){
        System.out.println("Carro");
        super.Detalhes();
        System.out.printf("O Consumo por KM é : %.2f L%n",getConsumoPorKm());
        System.out.println();
    }





}
