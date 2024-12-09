public class Gato {
    private String nome;

    public Gato(String nome){
        this.nome=nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
     public void comer(){
        System.out.println("O Gato comeu");
     }
     public void beber(){
        System.out.println("O Gato bebeu");
     }
     public void miou(){
        System.out.println("O Gato miou ");
     }
     public void Nome(String nome){
        System.out.println("O nome do gato é "+nome);
     }
     public static void main(String[] args) {
        Gato gato=new Gato("Biscoito");

        gato.comer();
        gato.beber();
        gato.miou();
        gato.Nome("Galatico");



     }



}
