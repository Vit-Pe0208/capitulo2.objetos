package capítulo2;

import java.util.Scanner;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice("12356","dísco rígido",0,100);
		
		System.out.printf("O produto %s de código %s, comprado em %d quantidades foi de : %.2f%n",invoice.getDescrição(),invoice.getNumero(),invoice.getQtdI(),invoice.getInvoiceAmount());
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de item comprado: ");
		int qtdI= input.nextInt();
		System.out.printf("A quantidade do produto comprado foi: %d%n",qtdI);
		invoice.setQtdI(qtdI);
		
		System.out.printf("O preço total do produto foi: %.2f%n",invoice.getInvoiceAmount());		
	}
}
