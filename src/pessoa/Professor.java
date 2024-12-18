package pessoa;

public class Professor extends Pessoa{
    private String disciplina;

    public Professor(String nome,int idade,String disciplina){
        super(nome, idade);
        this.disciplina=disciplina;
    }
    public void setDisciplina(String disciplina){
        this.disciplina=disciplina;
    }
    public String getDisciplina(){
        return disciplina;
    }
    public void apresentar(){
        System.out.printf("%s com idade de %d irá dar aula da disciplina %s%n",getNome(),getIdade(),getDisciplina());
    }
    



}
