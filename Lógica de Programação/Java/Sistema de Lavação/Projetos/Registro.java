package Projetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Registro implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel labelt = new JLabel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel labelr = new JLabel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JRadioButton car1 = new JRadioButton("Pequeno");
	JRadioButton car2 = new JRadioButton("Médio");
	JRadioButton car3 = new JRadioButton("Grande");
	JRadioButton serv1 = new JRadioButton("Lavação Int.");
	JRadioButton serv2 = new JRadioButton("Lavação Int. + Ext.");
	JRadioButton serv3 = new JRadioButton("Lavação Int. + Ext. + Cera");
	ButtonGroup cars = new ButtonGroup();
	ButtonGroup servs = new ButtonGroup();
	JTextField input = new JTextField(40);
	GroupLayout layout = new GroupLayout(panel);
	
	static String name_f, car_f, serv_f;
	static int cont = 1;
	
	Registro(){
		
		ImageIcon logo = new ImageIcon("ifsc.png");
		
		layout.setAutoCreateContainerGaps(true);
		layout.setAutoCreateGaps(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(logo.getImage());
		frame.setSize(500, 350);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.add(panel);
		frame.setTitle("Sistema de Lavação");
		frame.setLocationRelativeTo(null);
		
		panel.setLayout(layout);
		panel.setVisible(true);
		
		button1.setText("Fechar");
		button2.setText("Limpar");
		button3.setText("Confirmar");
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		car1.addActionListener(this);
		car2.addActionListener(this);
		car3.addActionListener(this);
		serv1.addActionListener(this);
		serv2.addActionListener(this);
		serv3.addActionListener(this);
		
		labelt.setText("Registro da Ordem de Serviço");
		labelt.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setText("Qual o seu nome: ");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setText("Qual seu tipo de carro: ");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setText("Qual o tipo de serviço: ");
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		labelr.setText("Pedido a ser feito");
		labelr.setHorizontalAlignment(SwingConstants.CENTER);
		
		car1.setHorizontalAlignment(SwingConstants.LEFT);
		car2.setHorizontalAlignment(SwingConstants.CENTER);
		car3.setHorizontalAlignment(SwingConstants.RIGHT);
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		
		serv1.setHorizontalAlignment(SwingConstants.LEFT);
		serv2.setHorizontalAlignment(SwingConstants.CENTER);
		serv3.setHorizontalAlignment(SwingConstants.RIGHT);
		servs.add(serv1);
		servs.add(serv2);
		servs.add(serv3);
		
		layout.linkSize(SwingConstants.VERTICAL, input, label1);
		
		layout.setHorizontalGroup(
				layout.createParallelGroup()
				.addComponent(labelt, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(label1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(input)
				.addComponent(label2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup()
						.addComponent(car1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(car2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(car3, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addComponent(label3)
				.addGroup(layout.createSequentialGroup()
						.addComponent(serv1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(serv2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(serv3, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(labelr, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup()
						.addComponent(button1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button3, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(
				layout.createSequentialGroup()
				.addComponent(labelt, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(label1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(input)
				.addComponent(label2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup()
						.addComponent(car1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(car2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(car3, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addComponent(label3)
				.addGroup(layout.createParallelGroup()
						.addComponent(serv1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(serv2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(serv3, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addComponent(labelr, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup()
						.addComponent(button1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button3, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button1) {
			frame.dispose();
		}
		if (e.getSource()==button2) {
			input.setText("");
			cars.clearSelection();
			servs.clearSelection();
		}
		if (e.getSource()==button3) {
			name_f = input.getText();
			String name_data = cont+": " + name_f + "\n";
			if (car1.isSelected()) {
				car_f = car1.getText();
			}
			if (car2.isSelected()) {
				car_f = car2.getText();
			}
			if (car3.isSelected()) {
				car_f = car3.getText();
			}
			if (serv1.isSelected()) {
				serv_f = serv1.getText();
			}
			if (serv2.isSelected()) {
				serv_f = serv2.getText();
			}
			if (serv3.isSelected()) {
				serv_f = serv3.getText();
			}
			String car_data = cont+": "+ car_f + "\n";
			String serv_data = cont+": " + serv_f + "\n";
			String ordem = "Ordem "+cont+": "+name_f+"|"+car_f+"|"+serv_f+"\n";
			
			try {
				Files.write(Paths.get("C:/Users/Gabriel/OneDrive/Documentos/IFSC-main/Programação/Java/Sistema de Lavação/Dados Lavação/Clientes.txt"), name_data.getBytes(), StandardOpenOption.APPEND);
				Files.write(Paths.get("C:/Users/Gabriel/OneDrive/Documentos/IFSC-main/Programação/Java/Sistema de Lavação/Dados Lavação/Carros.txt"), car_data.getBytes(), StandardOpenOption.APPEND);
				Files.write(Paths.get("C:/Users/Gabriel/OneDrive/Documentos/IFSC-main/Programação/Java/Sistema de Lavação/Dados Lavação/Serviços.txt"), serv_data.getBytes(), StandardOpenOption.APPEND);
				Files.write(Paths.get("C:/Users/Gabriel/OneDrive/Documentos/IFSC-main/Programação/Java/Sistema de Lavação/Dados Lavação/Ordens.txt"), ordem.getBytes(), StandardOpenOption.APPEND);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			frame.dispose();
			new Nota_fiscal();
			input.setText("");
			cars.clearSelection();
			servs.clearSelection();
			labelr.setText("Nome: "+name_f+" | Carro: "+car_f+" | Serviço: "+serv_f);
		}
		
	}

}
