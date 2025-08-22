package Projetos;

import java.io.FileWriter;
import java.io.IOException;

public class Sistema_de_Lavação {

	public static void main(String[] args) throws IOException {
		
		FileWriter clients = new FileWriter("C:/Users/Gabriel/OneDrive/Documentos/IFSC-main/Programação/Java/Sistema de Lavação/Dados Lavação/Clientes.txt");
		FileWriter cars = new FileWriter("C:/Users/Gabriel/OneDrive/Documentos/IFSC-main/Programação/Java/Sistema de Lavação/Dados Lavação/Carros.txt");
		FileWriter servicos = new FileWriter("C:/Users/Gabriel/OneDrive/Documentos/IFSC-main/Programação/Java/Sistema de Lavação/Dados Lavação/Serviços.txt");
		FileWriter orders = new FileWriter("C:/Users/Gabriel/OneDrive/Documentos/IFSC-main/Programação/Java/Sistema de Lavação/Dados Lavação/Ordens.txt");
		
		new Registro();
		
		clients.close();
		cars.close();
		servicos.close();
		orders.close();
		

	}

}
