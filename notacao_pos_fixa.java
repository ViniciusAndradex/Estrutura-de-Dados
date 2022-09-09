package main;
import notacao.Pilha;

import javax.swing.JOptionPane;

public class notacao_pos_fixa {
	
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Digite uma expressão");
		Pilha jorge = new Pilha(a);
		
		jorge.teste_exp();
		
	}

}
