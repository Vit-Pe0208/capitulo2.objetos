package capítulo2;

import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) {
		Date date = new Date(0,0,0000);
		date.displayDate(date);
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Entre com o dia do seu nascimento: ");
		int dia=input.nextInt();
		date.setDia(dia);
		System.out.println("Entre com o mês do seu nascimento: ");
		int mês=input.nextInt();
		date.setMês(mês);
		System.out.println("Entre com o ano do seu nascimento: ");
		int ano=input.nextInt();
		date.setAno(ano);
		
		date.displayDate(date);
		
		
	
		
		
		
		
		
		
		
	}

}
