package capítulo2;

import javax.swing.JOptionPane;

public class Dialog1{
	public static void main(String[] args) {
		String nome= JOptionPane.showInputDialog("Digite seu nome: ");
		String message=
		String.format( "Bem-vindo ao programa java %s ",nome);
		JOptionPane.showMessageDialog(null, message);
		
	}
	
	
	
	
	
	
	
	
}
