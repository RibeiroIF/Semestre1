package QuestaoLOP;

import java.util.*;

public class aulalop {
	float num = 0, somatorio = 0;
	int cont = 0, par = 0, impar = 0, positivo = 0, entre = 0;
	float maior = 0, menor = 999, entretotal = 0, mediaentre = 0, parp = 0, imparp = 0;
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		aulalop valor = new aulalop();
		
		System.out.print("Quantos números iremos conferir: ");
		valor.cont = input.nextInt();
		
		for (int i = 0; i < valor.cont; i++) {
			System.out.print("Qual o número escolhido: ");
			valor.num = input.nextFloat();
			if (valor.num >= -5 && valor.num <= 5) {
				valor.entretotal+=valor.num;
				valor.entre++;
				System.out.print("O número está entre o intervalo de -5 e 5\n");
			}
			if (valor.num > valor.maior) {
				valor.maior = valor.num;
			}
			if (valor.num < valor.menor) {
				valor.menor = valor.num;
			}
			if (valor.num %2 == 0) {
				valor.par++;
			}
			if (valor.num%2 != 0) { 
				valor.impar++;
			}
			if (valor.num > 0) {
				valor.positivo++;
				System.out.print("O número "+valor.num+" é positivo\n");
				System.out.print("-----------------------------\n");
			}
			else if (valor.num < 0) {
				System.out.print("O número "+valor.num+" é negativo\n");
				System.out.print("-----------------------------\n");
			}
			else {
				System.out.print("O número é igual a zero\n");
				System.out.print("-----------------------------\n");
			}
			valor.somatorio += valor.num;
			valor.mediaentre = (valor.entretotal/valor.entre);
			valor.parp = (valor.par * 100)/valor.cont;
			valor.imparp = (valor.impar * 100)/valor.cont;
		}
		System.out.print("O total dos números lidos é de "+valor.somatorio+"\n");
		System.out.print("-----------------------------\n");
		System.out.print("A quantidade de números lidos foi de "+valor.cont+"\n");
		System.out.print("-----------------------------\n");
		System.out.print("A quantidade de valores pares é de: "+valor.parp+"%\nE a quantidade de valores ímpares é de: "+valor.imparp+"%\n");
		System.out.print("-----------------------------\n");
		System.out.print("A quantidade de números positivos é de: "+valor.positivo+"\n");
		System.out.print("-----------------------------\n");
		System.out.print("A qtd de números no intervalo dito é de: "+valor.entre+"\n");
		System.out.print("E a média dos valores neste intervalo é de: "+valor.mediaentre+"\n");
		System.out.print("-----------------------------\n");
		System.out.print("A maior número inserido foi o: "+valor.maior+"\nE o menor número inserido foi o: "+valor.menor+"\n");
		System.out.print("-----------------------------\n");
	}

}
