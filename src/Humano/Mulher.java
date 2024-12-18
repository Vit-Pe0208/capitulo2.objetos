package Humano;

public class Mulher extends humano {
    public Mulher(String nome){
        super(nome);
    }
    public void mestruar(){
        System.out.printf("%s mestruou%n",getNome());
    }


}
