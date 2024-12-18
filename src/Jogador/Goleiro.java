package Jogador;

public class Goleiro extends Jogador{
    public Goleiro(String nome){
           super(nome);
    }
    public void agarrar(){
        System.out.printf("%s faz defesas%n",getNome());
    }

}
