package capítulo2;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		Account account1=new Account("Vitor Pessoa Silva",27.00);
		Account account2=new Account("Vilmacy Maria Pessoa",-7.65);
		AccountTest.displayAccount(account1, account2);
		
		//adicionar ao saldo da conta 1
		System.out.println("entre com o deposit amount  para account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%n adicionar %.2f em account1%n%n", depositAmount);
		account1.deposit(depositAmount);
		AccountTest.displayAccount(account1, account2);
		
		//adicionar ao saldo da conta 2
		System.out.println("entre com o deposit amount  para account2: ");
		depositAmount= input.nextDouble();
		System.out.printf("%n adicionar %.2f em account2%n%n",depositAmount);
		account2.deposit(depositAmount);
		AccountTest.displayAccount(account1, account2);
		
		//débito da conta 1
		System.out.println("quanto deseja retirar de account1: ");
		double débito= input.nextDouble();
		System.out.printf("%n retirar %.2f em account1%n%n",débito);
		account1.withdraw(débito);
		AccountTest.displayAccount(account1, account2);
		
		//débito da conta 2.
		System.out.println("Quanto deseja retirar de account2: ");
		débito=input.nextDouble();
		System.out.printf("Retirar %.2f de account2%n%n", débito);
		account2.withdraw(débito);	
		AccountTest.displayAccount(account1, account2);
	}

      public static void displayAccount(Account account1, Account account2)
      {
    	  System.out.printf("%s tem balance: $%.2f%n", account1.getName(),account1.getBalance()); 
    	  System.out.printf("%s tem balance: $%.2f%n", account2.getName(),account2.getBalance()); 
    	   
      }
      
      

}

	      