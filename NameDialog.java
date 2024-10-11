package capítulo2;

import javax.swing.JOptionPane;

public class NameDialog {
	public static void main(String[] args) {
		String nome=JOptionPane.showInputDialog("Bem-vindo ao programa Java, Insira seu nome: ");
		String message=
				String.format("Bem-vindo,%s, ao programa java",nome);
		JOptionPane.showMessageDialog(null, message);
	}

	}


