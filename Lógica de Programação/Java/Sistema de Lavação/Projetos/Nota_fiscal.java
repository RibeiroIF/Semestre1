package Projetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Nota_fiscal implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	ImageIcon logo = new ImageIcon();
	GroupLayout layout = new GroupLayout(panel);
	
	Nota_fiscal(){
		
	logo = new ImageIcon("ifsc.png");
	
	layout.setAutoCreateContainerGaps(true);
	layout.setAutoCreateGaps(true);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setIconImage(logo.getImage());
	frame.setSize(400, 130);
	frame.setResizable(true);
	frame.setVisible(true);
	frame.setTitle("Ordem Registrada");
	frame.add(panel);
	frame.setLocationRelativeTo(null);
	
	panel.setLayout(layout);
	panel.setVisible(true);
	
	label.setText("Obrigado "+Registro.name_f+", sua Ordem de Serviço já foi registrada");
	label.setHorizontalAlignment(SwingConstants.CENTER);
	
	button1.setText("Fechar Janela");
	button1.addActionListener(this);
	button2.setText("Realizar serviço");
	button2.addActionListener(this);
	
	layout.setHorizontalGroup(
			layout.createParallelGroup()
			.addComponent(label, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			.addGroup(layout.createSequentialGroup()
					.addComponent(button1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(button2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
	layout.setVerticalGroup(
			layout.createSequentialGroup()
			.addComponent(label, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			.addGroup(layout.createParallelGroup()
					.addComponent(button1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(button2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			frame.dispose();
		}
		if(e.getSource()==button2) {
			frame.dispose();
			Registro.cont++;
			new Registro();
		}
	}
}
