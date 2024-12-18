package transporrte;

public class Aereo extends Transporte {
    private double altitudeMaxima;

    public Aereo(int capacidade,double velocidadeMaxima,double altitudeMaxima){
        super(capacidade, velocidadeMaxima);
        this.altitudeMaxima=altitudeMaxima;
    }
    public void setAltitudeMaxima(double altitudeMaxima){
        this.altitudeMaxima=altitudeMaxima;
    }
    public double getAltitudeMaxima(){
        return altitudeMaxima;
    }
    @Override
    public void exibirInformacoes(){
        System.out.println("Transporte aéreo");
        super.exibirInformacoes();
        System.out.printf("a Altitude Máxima é: %.2fKm%n",altitudeMaxima);
        System.out.println();
    }

}
