package negocio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import persistencia.UserDAO;

public class SemifinalWindow extends JFrame {
	private FinalWindow finalWindow;
	private JTextField s1Sf;
	private JTextField s2Sf;
	private JTextField s3Sf;
	private JTextField s4Sf;
	private JTextField p1S1;
	private JTextField p2S2;
	private JTextField p3S3;
	private JTextField p4S4;
	private User user;
	private UserDAO userDAO;
	
	public SemifinalWindow() {
		this.finalWindow=new FinalWindow();
		this.user=finalWindow.getUser();
		this.userDAO=finalWindow.getUserDAO();
		this.s1Sf=createTextSelection(7);
		this.s2Sf=createTextSelection(7);
		this.s3Sf=createTextSelection(7);
		this.s4Sf=createTextSelection(7);
		this.p1S1=createTextSelection(3);
		this.p2S2=createTextSelection(3);
		this.p3S3=createTextSelection(3);
		this.p4S4=createTextSelection(3);
		setSize(1400, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(4, 1));
		this.add(createPanel1());
		this.add(createPanel2());
		this.add(createPanel3());
		this.add(createPanel4());
//		setVisible(true);
	}
	
	public JPanel createPanel1() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		panel.add(createLabel("SEMIFINAL") );
		return panel;
	}
	
	public JLabel createLabel(String s) {
		JLabel label=new JLabel(s);
		label.setForeground(Color.WHITE);
		return label;
	}
	
	public JPanel createPanel2(){
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		panel.add(createLabel("SELECAO"));
		panel.add(s1Sf);
		panel.add(createLabel("PLACAR"));
		panel.add(p1S1);
		panel.add(createLabel("   X   "));
		panel.add(createLabel("SELECAO"));
		panel.add(s2Sf);
		panel.add(createLabel("PLACAR"));
		panel.add(p2S2);
		return panel;
	}
	
	public JPanel createPanel3() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		panel.add(createLabel("SELECAO"));
		panel.add(s3Sf);
		panel.add(createLabel("PLACAR"));
		panel.add(p3S3);
		panel.add(createLabel("   X   "));
		panel.add(createLabel("SELECAO"));
		panel.add(s4Sf);
		panel.add(createLabel("PLACAR"));
		panel.add(p4S4);
		return panel;
	}
	
	public JPanel createPanel4() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		panel.add(createButton());
		return panel;
	}
	
	public JTextField createTextSelection(int columns) {
		JTextField text=new JTextField(columns);
		return text;
	}
	
	public JButton createButton() {
		JButton button = new JButton ("ENVIAR");
		button.setBackground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.getS1Sf().setName(s1Sf.getText());
				user.getS2Sf().setName(s2Sf.getText());
				user.getS3Sf().setName(s3Sf.getText());
				user.getS4Sf().setName(s4Sf.getText());
				user.getS1Sf().setScoreboard(Integer.parseInt(p1S1.getText()));
				user.getS2Sf().setScoreboard(Integer.parseInt(p2S2.getText()));
				user.getS3Sf().setScoreboard(Integer.parseInt(p3S3.getText()));
				user.getS4Sf().setScoreboard(Integer.parseInt(p4S4.getText()));
				CompareScoreboard();
				dispose();
				getFinalWindow();
			}
		});
		return button;
	}
	
	public void setJTextField(String aux1,String aux2,String aux3,String aux4) {
		this.s1Sf.setText(aux1);
		this.s2Sf.setText(aux2);
		this.s3Sf.setText(aux3);
		this.s4Sf.setText(aux4);
		
	}
	
	public void CompareScoreboard() {
		String aux1,aux2;
		if((Integer.parseInt(p1S1.getText()))>(Integer.parseInt(p2S2.getText()))) {
			aux1=s1Sf.getText();
		}
		else {
			aux1=s2Sf.getText();
		}
		if((Integer.parseInt(p3S3.getText()))>(Integer.parseInt(p4S4.getText()))) {
			aux2=s3Sf.getText();
		}
		else {
			aux2=s4Sf.getText();
		}
		this.finalWindow.setJTextField(aux1, aux2);
	}
		
	public User getUser() {
		return this.user;
	}
	
	public FinalWindow getFinalWindow() {
		this.finalWindow.setVisible(true);
		return this.finalWindow;
	}
	
	public UserDAO getUserDAO() {
		return this.userDAO;
	}
}
