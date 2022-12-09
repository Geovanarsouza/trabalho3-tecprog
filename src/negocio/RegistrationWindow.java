package negocio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import persistencia.UserDAO;

public class RegistrationWindow extends JFrame{
	private User user;
	private JTextField text;
	private QuarterFinalWindow quarterFinalWindow;
	private UserDAO userDAO;
	
	public RegistrationWindow() {
		this.quarterFinalWindow=new QuarterFinalWindow();
		this.user=quarterFinalWindow.getUser();
		this.userDAO=quarterFinalWindow.getUserDAO();
		this.text=createTextField();
		setSize(1400, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.add(createPanel1(),BorderLayout.NORTH);
		this.add(createPanel2(),BorderLayout.CENTER);
		this.add(createPanel3(),BorderLayout.SOUTH);
//		setVisible(false);
	}
	
	public JPanel createPanel1() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		panel.add(createLabel("INFORMACOES DO PARTICIPANTE DO BOLAO"));
		return panel;
	}
	
	public JPanel createPanel2() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		panel.add(createLabel("NOME"));
		panel.add(this.text);
		return panel;
	}
	
	public JPanel createPanel3() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		panel.add(createButton());
		return panel;
	}
	
	public JTextField createTextField() {
		JTextField text=new JTextField(7);
		return text;
	}
	
	public JLabel createLabel(String s) {
		JLabel label=new JLabel(s);
		label.setForeground(Color.WHITE);
		return label;
	}
	
	public JButton createButton() {
		JButton button = new JButton ("ENVIAR");
		button.setBackground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setName(text.getText());
				dispose();
				getQuarterFinalWindow();
			}
		});
		return button;
	}
	
	public QuarterFinalWindow getQuarterFinalWindow() {
		this.quarterFinalWindow.setVisible(true);
		return this.quarterFinalWindow;
	}
	
	public UserDAO getUserDAO() {
		return this.userDAO;
	}
}
