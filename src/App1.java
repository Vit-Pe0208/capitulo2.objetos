import Humano.Homem;
import Humano.Mulher;
public class App1 {
    public static void main(String[] args) {
        Homem homem=new Homem("Vitor");
        Mulher mulher=new Mulher("Joana");

        homem.andar();
        homem.comer();
        homem.dormir();
        mulher.andar();
        mulher.comer();
        mulher.dormir();
        homem.héteroTop();
        homem.mijou();
        mulher.mestruar();

    }

}
