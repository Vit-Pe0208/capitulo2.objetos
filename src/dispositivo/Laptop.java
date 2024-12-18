package dispositivo;

public class Laptop extends Dispositivo {
    private int memoriaRam;

    public Laptop(String marca,String modelo,int memoriaRam){
        super(marca, modelo);
        this.memoriaRam=memoriaRam;        
    }
    public void setMemoriaRam(int memoriaRam){
        this.memoriaRam=memoriaRam;
    }
    public int getMemoriaram(){
        return memoriaRam;
    }
    @Override
    public void Informacoes(){
        System.out.println("O laptop");
        super.Informacoes();
        System.out.printf(" e a memoria Ram é de %d GB%n",memoriaRam);
    }

}
