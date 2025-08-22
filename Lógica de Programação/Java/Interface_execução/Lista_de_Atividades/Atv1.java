package Lista_de_Atividades;

import javax.swing.JOptionPane;

public class Atv1 {

	public static void main(String[] args) {
		
		int aux = 0;
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro número escolhido?: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo número escolhido?: "));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Qual o terceiro número escolhido?: "));
		
		if (num1 > num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		if (num1 > num3) {
			aux = num1;
			num1 = num3;
			num3 = aux;
		}
		if (num2 > num3) {
			aux = num2;
			num2 = num3;
			num3 = aux;
			
		JOptionPane.showMessageDialog(null, "Os números escolhidos, em forma crescente, foram: "+num1+", "+num2+", "+num3);
		}
	}
}
