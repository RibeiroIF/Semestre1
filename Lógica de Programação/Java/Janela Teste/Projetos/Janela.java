package Projetos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela implements ActionListener {

	JButton button = new JButton();
	JFrame frame = new JFrame();
	JTextField num1 = new JTextField();
	JTextField num2 = new JTextField();
	JTextField num3 = new JTextField();
	float n1, n2, n3, aux;
	
	
	Janela() {
		
		frame = new JFrame();
		button = new JButton("Resolver Questão");
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		num1 = new JTextField();
		num2 = new JTextField();
		num3 = new JTextField();
		
		ImageIcon logo = new ImageIcon("ifsc.png");
		
		frame.setSize(800, 500);
		frame.setIconImage(logo.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Frame Teste");
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.getContentPane().setBackground(new Color(60,100,200));
		frame.add(panel1);
		frame.add(panel2);
		frame.add(button);
		
		button.setBounds(310, 425 ,200 , 30);
		button.setVisible(true);
		button.setFocusable(true);
		button.addActionListener(this);
		
		panel1.setBounds(12, 20, 760, 400);
		panel1.setBackground(Color.WHITE);
		panel1.add(label1);
		panel1.add(num1);
		panel1.add(num2);
		panel1.add(num3);
		
		label1.setText("Questão 1: Faça um programa que leia três números inteiros e os imprima em ordem crescente.");
		label1.setFont(new Font("Jet Brains Mono", Font.PLAIN, 18));
		
		num1.setPreferredSize(new Dimension(200, 20));
		num2.setPreferredSize(new Dimension(200, 20));
		num3.setPreferredSize(new Dimension(200, 20));
		
	}
	

public static void main(String[] args) {
	
	new Janela();
}

	
public void actionPerformed(ActionEvent e) {
	
	n1 = Float.parseFloat(num1.getText());
	n2 = Float.parseFloat(num2.getText());
	n3 = Float.parseFloat(num3.getText());
	
	if (n1 > n2) {
		aux = n1;
		n1 = n2;
		n2 = aux;
	}
	if (n1 > n3) {
		aux = n1;
		n1 = n3;
		n3 = aux;
	}
	if (n2 > n3) {
		aux = n2;
		n2 = n3;
		n3 = aux;
	}
		if(e.getSource()==button) {
			frame.dispose();
			System.out.println("Os números escolhidos foram: "+n1+", "+n2+" e "+n3);
		}
		
}
}
