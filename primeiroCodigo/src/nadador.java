public class nadador {
    //Crie uma classe Nadador com os atributos nome e idade.
    // Em seguida, crie um objeto dessa classe e defina os valores dos métodos/atributos e mostre para o usuário.
   private String nome;
   private int idade;

    public nadador(String nome,int idade){

        this.nome=nome;
        this.idade=idade;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }
    void nadar(){
        System.out.println("o nadador está na piscina");

    }
    void rápido(){
        System.out.println("O nadador está na velocidade máxima");
    }
    void lento(){
       System.out.println("nadador está devagar");
    }
    void prova(String nome,int distancia){
        System.out.println(nome+"  está na prova de "+distancia+" metros");
    }

    public static void main(String[] args) {
        nadador nadador1=new nadador("Rafael",18);
        System.out.println("o nadador "+nadador1.nome+" de "+nadador1.idade+ " anos de idade  é muito foda!!!!!!!");
        System.out.println("nome do nadador: "+nadador1.getNome());
        System.out.println("idade do nadador:"+nadador1.getIdade());
        
        nadador1.nadar();
        nadador1.rápido();
        nadador1.lento();
        nadador1.prova("Rafael",93);
        
        
    }


}
