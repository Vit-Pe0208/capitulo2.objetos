import veiculo.Carro;
import veiculo.Moto;
import veiculo.Caminhao;
public class App8 {
    public static void main(String[] args) {
        Carro carro = new Carro("Sedan",46.00,20);
        Moto moto = new Moto("Toyota",13.00,"elétrico");
        Caminhao caminhao = new Caminhao("Mercedez",1500.00,2);

        carro.Detalhes();
        moto.Detalhes();
        caminhao.Detalhes();


        
    }

}
