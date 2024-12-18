import pagamento.CartaoCredito;
import pagamento.Boleto;
import pagamento.Pix;
public class App7 {
    public static void main(String[] args) {
        CartaoCredito cartao = new CartaoCredito(10.00,0.05);
        Boleto boleto = new Boleto(10.00,1.50);
        Pix pix = new Pix(10.00,10.00);
        cartao.realizarPagamento();
        boleto.realizarPagamento();
        pix.realizarPagamento();


        
    }

}
