package capítulo2;

public class Employee {
	private String nome;
	private String sobrenome;
	private double salário;
	
	public Employee(String nome, String sobrenome, double salário) {
		this.nome=nome;
		this.sobrenome=sobrenome;
		 if(salário>0.0)
		this.salário=salário;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalário() {
		return salário;
	}

	public void setSalário(double salário) {
		if(salário>0.0)
		this.salário = salário;
	}
	
	public void  salarioAumento(Employee exployee ) {
		this.salário=salário+(salário*0.1);
	}
	public static void salárioAtualizado(Employee exployee) {
		System.out.printf("salário atualizado de %s %s: %.2f%n",exployee.getNome(),exployee.getSobrenome(), exployee.getSalário());
	}
     
}
