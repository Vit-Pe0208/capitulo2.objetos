public class ContaBancaria {
    //atributos da classe
        String numero;
        double saldo;
//método getters e setters
        public String getNumero(){
            return numero;
        }
        public double getSaldo(){
            return saldo;
        }
        public void setNumero(String numero){
            this.numero=numero;
        }
        public void setSaldo(double saldo){
            this.saldo=saldo;
        }
        public static void main(String[] args) {
            ContaBancaria conta=new ContaBancaria();
            conta.setNumero("1207685934");
            conta.setSaldo(12000);
            System.out.println("A conta "+conta.getNumero()+" tem saldo de "+conta.getSaldo());
        }


    

}
