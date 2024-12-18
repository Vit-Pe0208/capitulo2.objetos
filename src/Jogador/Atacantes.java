package Jogador;

public class Atacantes extends Jogador {
    public Atacantes(String nome){
        super(nome);
    }
    public void atacará(){
        System.out.printf("%s atacará as linhas da defesa adversária%n",getNome());
    }


}
