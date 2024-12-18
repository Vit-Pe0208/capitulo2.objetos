package veiculo;

public class Veiculo {

    private String modelo;
    private double capacidadeTanque;

    public Veiculo(String modelo,double capacidadeTanque){
        this.modelo=modelo;
        this.capacidadeTanque=capacidadeTanque;       
    }

    public void setModelo(String modelo){
       this.modelo=modelo;
    }
    public String getModelo(){
        return modelo;
    }
    public void setCapacidadeTanque(double capacidadeTanque){
        this.capacidadeTanque=capacidadeTanque;
    }
    public double getCapacidadeTanque(){
        return capacidadeTanque;
    }

    public void Detalhes(){
        System.out.printf("Modelo: %s%n",getModelo());
        System.out.printf("Capacidade de Tanque: %.2fL%n",getCapacidadeTanque());
      
       
    }




}
