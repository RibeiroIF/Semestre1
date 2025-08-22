package Lista_de_Atividades;

import javax.swing.JOptionPane;

public class Atv3 {

	public static void main(String[] args) {
		
		String categoria = "";
		String nome = JOptionPane.showInputDialog("Qual seu nome?: ");
		float altura = Float.parseFloat(JOptionPane.showInputDialog("Qual a sua altura?: "));
		
		if (altura < 1.75) {
			categoria = "Insuficiente";
		}
		else if (altura < 1.85) {
			categoria = "Regular";
		}
		else if (altura < 1.95) {
			categoria = "Boa";
		}
		else {
			categoria = "Ótima";
		}
			
		JOptionPane.showMessageDialog(null, "Olá "+nome+", você está na categoria "+categoria);
	}
}

