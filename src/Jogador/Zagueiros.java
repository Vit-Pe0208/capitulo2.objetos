package Jogador;

public class Zagueiros extends Jogador {
    public Zagueiros(String nome){
        super(nome);
    }
    public void DefenderCampo(){
        System.out.printf("%s proteger a última linha de defesa antes do goleiro%n",getNome());
    }

}
