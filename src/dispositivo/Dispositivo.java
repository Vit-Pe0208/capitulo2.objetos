package dispositivo;

public class Dispositivo {
    private String marca;
    private String modelo;

    public Dispositivo(String marca,String modelo){
        this.marca=marca;
        this.modelo=modelo;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
     public String getMarca(){
        return marca;
     }
     public String modelo(){
        return modelo;
     }
     public void Informacoes(){
        System.out.printf("O dispostivo móvel com a marca %s é do modelo %s",marca,modelo);
     }

}
