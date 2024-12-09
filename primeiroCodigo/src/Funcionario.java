
public class Funcionario {
    private String nome;
    private double salario;

    public String getNome(){
        return nome;
    }
    public double getSalario(){
        return salario;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }
    public void exibirValor(){
        System.out.println("O Funcionário "+getNome()+" tem um salário de "+getSalario());
    }

    public static void main(String[] args) {
        Funcionario funcionario= new Funcionario();
        funcionario.setNome("Vitor Pessoa Silva");
        funcionario.setSalario(1435.5);
        funcionario.exibirValor();
        
    }

}
