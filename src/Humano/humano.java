package Humano;

public class humano {
    private String nome;

    public humano(String nome){
        this.nome=nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void falar(){
        System.out.printf("%s está falando%n",nome);
    }
    public void andar(){
        System.out.printf("%s está andando%n",nome);
    }
    public void comer(){
        System.out.printf("%s está comendo%n",nome);
    }
    public void dormir(){
        System.out.printf("%s está dormindo%n",nome);
    }


}
