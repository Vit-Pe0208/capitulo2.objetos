package capítulo2;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee exployee1 = new Employee("Vilmacy","Maria",8000.00);
		Employee exployee2 = new Employee("Vitor","Pessoa",1200.00);
		
		System.out.printf("%s %s tem salário de : $ %.2f%n", exployee1.getNome(),exployee1.getSobrenome(),exployee1.getSalário());
		System.out.printf("%s %s tem salário de : $ %.2f%n", exployee2.getNome(),exployee2.getSobrenome(),exployee2.getSalário());
		
		exployee1.salarioAumento(exployee1);
		exployee2.salarioAumento(exployee2);
		
		Employee.salárioAtualizado(exployee1);
		Employee.salárioAtualizado(exployee2);
	}

}
