public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome,int idade){
        
       if (idade<0 ||  idade>120) {
        System.out.println("idade inválida");  
       }else{
        this.idade=idade;
       }
    }

    //método setter
    public void setNome(String nome){
        this.nome=nome;
    }
    //método getter
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
        if (idade<0 || idade>120) {
            System.out.println("idade inválida");     
        }else{
           this.idade=idade;
        }       
        
    }
    public int getIdade(){
        return idade;
    }
    public void exibirValores(){
        System.out.println("O nome do aluno é  "+getNome()+" e a sua idade é "+getIdade());
    }
    public static void main(String[] args) {
        Pessoa pessoa=new Pessoa(null,0);
        pessoa.setNome("Vitor");
        pessoa.setIdade(140);
        pessoa.exibirValores();        
    }

}
