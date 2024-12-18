import transporrte.Terrestre;
import transporrte.Aereo;
import transporrte.Maritimo;
public class App6 {
    public static void main(String[] args) {
        Terrestre terrestre= new Terrestre(13, 200, "gasolina");
        Aereo aereo = new Aereo(1, 1289, 12.2);
        Maritimo maritimo = new Maritimo(2, 160,"V");
        terrestre.exibirInformacoes();
        aereo.exibirInformacoes();
        maritimo.exibirInformacoes();
    }

}
