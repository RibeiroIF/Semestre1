package Lista_de_Atividades;

import javax.swing.JOptionPane;

public class Atv4 {

	public static void main(String[] args) {
		
		float soma = 0, media = 0, maior = 0, menor = 999;
		
		for (int i = 1; i < 6; i++) {
			float num = Float.parseFloat(JOptionPane.showInputDialog("Insira o "+i+"° número: "));
			if (num > maior) {
				maior = num;
			}
			if (num < menor) {
				menor = num;
			}
			soma += num;
			media = soma/5;
		}
		JOptionPane.showMessageDialog(null, "A soma dos números escolhidos é de:    "+soma+
				                          "\nO maior número entre eles é o:         "+maior+
				                          "\nO menor número entre eles é o:         "+menor+
				                          "\nE sua média aritmética é de:           "+media);
	}

}
