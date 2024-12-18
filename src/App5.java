import dispositivo.Celular;
import dispositivo.Laptop;

public class App5 {
    public static void main(String[] args) {
        Celular celular = new Celular("Motorola","G50","Android");
        Laptop laptop = new Laptop("Samsung", "EBOOK30", 4);
        celular.Informacoes();
        laptop.Informacoes();
    }

}
