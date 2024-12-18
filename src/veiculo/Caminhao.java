package veiculo;

public class Caminhao extends Veiculo{
    private double capacidadeCarga;
    public Caminhao(String modelo,double capacidadetanque,double capacidadeCarga){
       super(modelo, capacidadetanque);
        this.capacidadeCarga=capacidadeCarga;
    }
    public void setCapacidadeCarga(double capacidadeCarga){
        this.capacidadeCarga=capacidadeCarga;
    }
    public double getCapacidadeCarga(){
        return capacidadeCarga;
    }
    @Override
    public void Detalhes(){
        System.out.println("Caminhão");
        super.Detalhes();
        System.out.printf("Capacidade de carga: %.2f T",getCapacidadeCarga());    
    }

   
    

}
