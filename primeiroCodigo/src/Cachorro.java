public class Cachorro {
    private String nome;

    public Cachorro(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    void comer(){
        System.out.println("O cachorro está comendo");
    }
    void beber(){
        System.out.println("O cachorro está bebendo");
    }
    void latir(){
        System.out.println("O cachorro está latindo");
    }

    void lamber(){
        System.out.println("O cachorro está lambendo");
    }
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Thor");
        cachorro.comer();
        cachorro.beber();
        cachorro.latir();
        cachorro.lamber();
    }


    

}
