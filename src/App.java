
import Banco.ContaCorrente;
import Banco.ContaPoupanca;
public class App {
    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente("111111", 1200.00,800.00 );
        ContaPoupanca poupanca = new ContaPoupanca("111111", 1200.00, 0.05);
        corrente.exibirDetalhes();
        System.out.println();
        poupanca.exibirDetalhes();
    }

    
   
}
