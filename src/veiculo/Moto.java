package veiculo;

public class Moto extends Veiculo {
      private String tipoMotor;
      public Moto(String modelo,double capacidadeTanque,String tipoMotor){
        super(modelo, capacidadeTanque);
        this.tipoMotor = tipoMotor;
      }

      public void setTipoMotor(String tipoMotor){
        this.tipoMotor = tipoMotor;
      }
      public String getTipoMotor(){
        return tipoMotor;
      }
      @Override
      public void Detalhes(){
        System.out.println("Moto");
        super.Detalhes();
        System.out.printf("O tipo de motor é %s%n", getTipoMotor());
        System.out.println();
      }

     



}
