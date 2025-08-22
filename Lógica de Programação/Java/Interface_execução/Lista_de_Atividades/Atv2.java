package Lista_de_Atividades;

import javax.swing.JOptionPane;

public class Atv2 {

	public static void main(String[] args) {
		
		int maior = 0, menor = 999, medio = 0;
		
		for (int i = 0; i < 3; i++) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Qual o número escolhido?: "));
		if (num > maior) {
			maior = num;
		}
		if (num < menor) {
			menor = num;
		}
		if (num < maior && num > menor) {
			medio = num;
		}	
		}
		JOptionPane.showMessageDialog(null, "Os números escolhidos (em ordem para menor, médio e maior) foram: "+menor+", "+medio+", "+maior);
	}
}