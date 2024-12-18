package transporrte;

public class Transporte {
    private int capacidade;
    private double velocidadeMaxima;

    public Transporte(int capacidade,double velocidadeMaxima){
        this.capacidade=capacidade;
        this.velocidadeMaxima=velocidadeMaxima;
    }
    public void setCapacidade(int capacidade){
        this.capacidade=capacidade;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima){
        this.velocidadeMaxima=velocidadeMaxima;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public double getvelocidademaxima(){
        return velocidadeMaxima;
    }
    public void exibirInformacoes(){
        System.out.printf("Capacidade do Transporte: %dT%n",getCapacidade());
        System.out.printf("a velocidade máxima é: %.2fKM%n", getvelocidademaxima());
        

    }


}
