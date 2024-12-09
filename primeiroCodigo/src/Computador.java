public class Computador {
    //Atributos da classe
    String marca;
    double preço;
    int memoriaRam;
    int hd;
    // Construtor da classe
    public Computador(String marca,double preço,int memoriaRam,int hd){
        this.marca=marca;
        this.preço=preço;
        this.memoriaRam=memoriaRam;
        this.hd=hd;
    }
    //Métodos getters para acessar os atributos
    public String getMarca(){
        return marca;
    }
    public double getPreço(){
        return preço;
    }
    public int getMemoriaRam(){
        return memoriaRam;
    }
    public int getHd(){
        return hd;
    }
    //Método main para criar um objeto e definir os valores dos atributos
    public static void main(String[] args) {
        //Criando um objeto da classe Computador e definindo os valores dos atributos
        Computador computador = new Computador("Apple",2079.00,4,1);
        //Exibindo os valores dos atributos do objeto
        System.out.println("o computador da marca "+computador.getMarca()+" com "+computador.getMemoriaRam()+"GB de memória ram e "+computador.getHd()+"TB no HD tem valor de R$ "+computador.getPreço());
        
        
    }
}
