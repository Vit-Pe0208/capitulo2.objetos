import Banco.*;


public class App10 {
     public static void main(String[] args) {
        ContaBancaria[]conta= new ContaBancaria[4];

        conta[0]=new ContaCorrente("111111", 1200.00, 1000.00);
        conta[1]=new ContaPoupanca("111111", 1200.00, 0.05);
        conta[2]=new ContaCorrente("111111", 1200.00, 900.00);
        conta[3]=new ContaBancaria("111111",1200.00);
         
        for(ContaBancaria ContaBancaria:conta){
            ContaBancaria.exibirDetalhes();
        }
    
    }

}
