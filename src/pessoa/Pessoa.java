package pessoa;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome,int idade){
        this.nome=nome;
        this.idade=idade;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void setidade(int idade){
        this.idade=idade;
    }
    public int getIdade(){
        return idade;
    }

    public void apresentar(){
        System.out.printf("%s com idade de %d irá apresentar o trabalho%n",nome,idade);
        
    }

}
