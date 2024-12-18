import pessoa.Aluno;
import pessoa.Professor;
public class App3 {
    public static void main(String[] args) {
        Aluno aluno=new Aluno("Vitor",22,"Análise");
        Professor professor = new Professor("Rafael", 39, "Análise");
        aluno.apresentar();
        professor.apresentar();
        
    }

}
