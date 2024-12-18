package Jogador;

public class MeioCampista extends Jogador {
    public MeioCampista(String nome){
        super(nome);
    }

    public void Ligar(){
        System.out.printf("%s ligar a defesa ao ataque durante a partida e evitar golpes de adversários%n",getNome());
    }
    public void volante(){
        System.out.printf("%s evitar golpes e ser o ultimo homem do meio",getNome());
    }
    public void meiocampo(){
        System.out.printf("%s é o homem do meio campo, equilibrio entre ataque e defesa%n",getNome());
    }
    public void meioatacante(){
        System.out.printf("%s o meio campista mais à frente, próximos dos atacantes%n",getNome());
    }


}
