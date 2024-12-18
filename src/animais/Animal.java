package animais;

public class Animal {
    private String nome;
    //método construtor
    public Animal(String nome){
        this.nome=nome;
    }
    //métodos Setters e getter
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    //métodos 
    public void comer(){
        System.out.printf("%s comeu\n",nome);
    }
    public void beber(){
        System.out.printf("%s bebeu\n",nome);
    }
}
