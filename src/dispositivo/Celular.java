package dispositivo;

public class Celular extends Dispositivo {
    private String sistemaOperacional;

    public Celular(String marca,String modelo,String sistemaOperacional){
        super(marca, modelo);
        this.sistemaOperacional=sistemaOperacional;

    }
    public void setSistemaOperacional(String sistemaOperacional){
        this.sistemaOperacional=sistemaOperacional;
    }
    public String getSistemaOperacional(){
        return sistemaOperacional;
    }
    @Override
    public void Informacoes(){
        System.out.println("Celular");
        super.Informacoes();
        System.out.printf(" e o SO do celular é %s%n",sistemaOperacional);
    }


}
