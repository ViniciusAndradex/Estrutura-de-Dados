package main;
import pilha.Pilha;

import javax.swing.JOptionPane;

public class PosFixa {
	
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Digite uma expressão");
		Pilha jorge = new Pilha(a);
		
		jorge.teste_exp();
		
	}

}
