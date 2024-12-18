package pessoa;

public class Aluno extends Pessoa {
    private String curso;
    public Aluno(String nome,int idade,String curso){
        super(nome,idade);   
        this.curso=curso;
    }
    
    public void setCurso(String curso){
        this.curso=curso;
    }
    public String getCurso(){
        return curso;
    }
    public void apresentar(){
        System.out.printf("%s com idade de %d irá apresentar o trabalho do curso %s%n",getNome(),getIdade(),getCurso());
    }
    
    


}
