public class carro {
    //atributos da classe carro
    String cor;
    String modelo;
    String marca;

    public carro(String cor,String modelo,String marca){
        this.cor=cor;
        this.modelo=modelo;
        this.marca=marca;
    }

    public String getCor(){
        return cor;
    }
    public String getModelo(){
        return modelo;
    }
    public String getMarca(){
        return marca;
    }

    //métodos do carro
    void acelerar(){
        System.out.println(" carro está acelerando");
    }
    void frear(){
        System.out.println("O carro vai frear");
    }
    void virar(String direcao){
        System.out.println("O carro está virando para a  " +direcao+".");
    }
    public static void main(String[] args) {
        //Criação do objeto de classe carro.
        carro carro1=new carro("Vermelho","Mercedez","BMW");
        System.out.println("o meu carro "+carro1.getCor()+" da marca "+carro1.getMarca()+" é do modelo "+carro1.getModelo());
         carro1.acelerar();
         carro1.frear();
         carro1.virar("direita");
    

       


    }

}

