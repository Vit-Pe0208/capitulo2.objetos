package Jogador;

public class Laterais extends Jogador{
    public Laterais(String nome){
        super(nome);
    }
    public void defenderLador(){
        System.out.printf("%s fecha os lados da linha de defesa%n",getNome());        
    }
    public void apoiarLados(){
        System.out.printf("%s Apoiar nas jogadas de ataque%n",getNome());
    }

}
