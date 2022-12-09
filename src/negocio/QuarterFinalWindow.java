package negocio;

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

public class QuarterFinalWindow extends JFrame{
	
	private SemifinalWindow semifinalWindow;
	
	private User user;
	private UserDAO userDAO;
	
	private JTextField s1Qf;
	private JTextField s2Qf;
	private JTextField s3Qf;
	private JTextField s4Qf;
	private JTextField s5Qf;
	private JTextField s6Qf;
	private JTextField s7Qf;
	private JTextField s8Qf;
	
	private JTextField p1S1;
	private JTextField p2S2;
	private JTextField p3S3;
	private JTextField p4S4;
	private JTextField p5S5;
	private JTextField p6S6;
	private JTextField p7S7;
	private JTextField p8S8;

	public QuarterFinalWindow() {
		this.semifinalWindow=new SemifinalWindow();
		this.user=semifinalWindow.getUser();
		this.userDAO=semifinalWindow.getUserDAO();
		this.s1Qf=createJTextField(7);
		this.s2Qf=createJTextField(7);
		this.s3Qf=createJTextField(7);
		this.s4Qf=createJTextField(7);
		this.s5Qf=createJTextField(7);
		this.s6Qf=createJTextField(7);
		this.s7Qf=createJTextField(7);
		this.s8Qf=createJTextField(7);
		this.p1S1=createJTextField(3);
		this.p2S2=createJTextField(3);
		this.p3S3=createJTextField(3);
		this.p4S4=createJTextField(3);
		this.p5S5=createJTextField(3);
		this.p6S6=createJTextField(3);
		this.p7S7=createJTextField(3);
		this.p8S8=createJTextField(3);
		setNameSelection();
		setSize(1400, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(6, 1));
		this.add(createPanel1());
		this.add(createPanel2());
		this.add(createPanel3());
		this.add(createPanel4());
		this.add(createPanel5());
		this.add(createPanel6());
//		setVisible(true);

	}
	
	public JPanel createPanel1() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		panel.add(createLabel("QUARTAS DE FINAL") );
		return panel;
	}
	
	public JPanel createPanel2() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		panel.add(createLabel("SELECAO"));
		panel.add(this.s1Qf);
		panel.add(createLabel("PLACAR"));
		panel.add(this.p1S1);
		panel.add(createLabel("   X   "));
		panel.add(createLabel("SELECAO"));
		panel.add(this.s2Qf);
		panel.add(createLabel("PLACAR"));
		panel.add(this.p2S2);
		return panel;
	}
	
	public JPanel createPanel3() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		panel.add(createLabel("SELECAO"));
		panel.add(this.s3Qf);
		panel.add(createLabel("PLACAR"));
		panel.add(this.p3S3);
		panel.add(createLabel("   X   "));
		panel.add(createLabel("SELECAO"));
		panel.add(this.s4Qf);
		panel.add(createLabel("PLACAR"));
		panel.add(this.p4S4);
		return panel;
	}
	
	public JPanel createPanel4() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		panel.add(createLabel("SELECAO"));
		panel.add(this.s5Qf);
		panel.add(createLabel("PLACAR"));
		panel.add(this.p5S5);
		panel.add(createLabel("   X   "));
		panel.add(createLabel("SELECAO"));
		panel.add(this.s6Qf);
		panel.add(createLabel("PLACAR"));
		panel.add(this.p6S6);
		return panel;
	}
	
	public JPanel createPanel5() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		panel.add(createLabel("SELECAO"));
		panel.add(this.s7Qf);
		panel.add(createLabel("PLACAR"));
		panel.add(this.p7S7);
		panel.add(createLabel("   X   "));
		panel.add(createLabel("SELECAO"));
		panel.add(this.s8Qf);
		panel.add(createLabel("PLACAR"));
		panel.add(this.p8S8);
		return panel;
	}
	
	public JPanel createPanel6() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		panel.add(createButton());
		return panel;
	}
	
	public JButton createButton() {
		JButton button = new JButton ("ENVIAR");
		button.setBackground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.getS1Qf().setName(s1Qf.getText());
				user.getS2Qf().setName(s2Qf.getText());
				user.getS3Qf().setName(s3Qf.getText());
				user.getS4Qf().setName(s4Qf.getText());
				user.getS5Qf().setName(s5Qf.getText());
				user.getS6Qf().setName(s6Qf.getText());
				user.getS7Qf().setName(s7Qf.getText());
				user.getS8Qf().setName(s8Qf.getText());
				user.getS1Qf().setScoreboard(Integer.parseInt(p1S1.getText()));
				user.getS2Qf().setScoreboard(Integer.parseInt(p2S2.getText()));
				user.getS3Qf().setScoreboard(Integer.parseInt(p3S3.getText()));
				user.getS4Qf().setScoreboard(Integer.parseInt(p4S4.getText()));
				user.getS5Qf().setScoreboard(Integer.parseInt(p5S5.getText()));
				user.getS6Qf().setScoreboard(Integer.parseInt(p6S6.getText()));
				user.getS7Qf().setScoreboard(Integer.parseInt(p7S7.getText()));
				user.getS8Qf().setScoreboard(Integer.parseInt(p8S8.getText()));
				CompareScoreboard();
				dispose();
				getSemifinalWindow();
			}
		});
		return button;
	}
	
	public JLabel createLabel(String s) {
		JLabel label=new JLabel(s);
		label.setForeground(Color.WHITE);
		return label;
	}
	
	public JTextField createJTextField(int columns) {
		JTextField text=new JTextField(columns);
		return text;
	}
	
	public void setNameSelection() {
		this.s1Qf.setText("CRO");
		this.s2Qf.setText("BRA");
		this.s3Qf.setText("HOL");
		this.s4Qf.setText("ARG");
		this.s5Qf.setText("MAR");
		this.s6Qf.setText("POR");
		this.s7Qf.setText("ING");
		this.s8Qf.setText("FRA");
	}
	
	public void CompareScoreboard() {
		String aux1,aux2,aux3,aux4;
		if((Integer.parseInt(p1S1.getText()))>(Integer.parseInt(p2S2.getText()))) {
			aux1=s1Qf.getText();
		}
		else {
			aux1=s2Qf.getText();
		}
		if((Integer.parseInt(p3S3.getText()))>(Integer.parseInt(p4S4.getText()))) {
			aux2=s3Qf.getText();
		}
		else {
			aux2=s4Qf.getText();
		}
		if((Integer.parseInt(p5S5.getText()))>(Integer.parseInt(p6S6.getText()))) {
			aux3=s5Qf.getText();
		}
		else {
			aux3=s6Qf.getText();
		}
		if((Integer.parseInt(p7S7.getText()))>(Integer.parseInt(p8S8.getText()))) {
			aux4=s7Qf.getText();
		}
		else {
			aux4=s8Qf.getText();
		}
		semifinalWindow.setJTextField(aux1, aux2, aux3, aux4);
	}
	public User getUser() {
		return this.user;
	}
	
	public SemifinalWindow getSemifinalWindow() {
		this.semifinalWindow.setVisible(true);
		return this.semifinalWindow;
	}
	
	public UserDAO getUserDAO() {
		return this.userDAO;
	}

}
