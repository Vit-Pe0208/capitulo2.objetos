package Jogador;

public class Jogador {
    private String nome;

    public Jogador(String nome){
        this.nome=nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void jogar(){
        System.out.printf("%s joga%n",nome);
    }
   public void atacar(){
     System.out.printf("%s joga no  ataque%n",nome);
   }
   public void defender(){
    System.out.printf("%s joga na defesa %n",nome);
   }
    public void reserva(){
        System.out.printf("%s está no banco de reservas%n",nome);
    }
    public void Coringa(){
        System.out.printf("%s joga no ataque e defesa%n",nome);
    }
}
