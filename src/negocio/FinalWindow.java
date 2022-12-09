package negocio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import persistencia.UserDAO;

public class FinalWindow extends JFrame{
	private User user;
	private JTextField s1F;
	private JTextField s2F;
	private JTextField p1S1;
	private JTextField p2S2;
//	private static ImageIcon flag;
	private UserDAO userDAO;

	public FinalWindow() {
		userDAO=new UserDAO();
		this.user=new User();
		this.s1F=createTextSelection(7);
		this.s2F=createTextSelection(7);
		this.p1S1=createTextSelection(3);
		this.p2S2=createTextSelection(3);
		setSize(1400, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.add(createPanel1(),BorderLayout.NORTH);
		this.add(createPanel2(),BorderLayout.CENTER);
		this.add(createPanel3(),BorderLayout.SOUTH);
//		setVisible(true);
	}
	
	public JPanel createPanel1() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		panel.add(createLabel("FINAL") );
		return panel;
	}
	
	public JPanel createPanel2() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		panel.add(createLabel("SELECAO"));
		panel.add(this.s1F);
		panel.add(createLabel("PLACAR"));
		panel.add(this.p1S1);
		panel.add(createLabel("   X   "));
		panel.add(createLabel("SELECAO"));
		panel.add(this.s2F);
		panel.add(createLabel("PLACAR"));
		panel.add(this.p2S2);
		return panel;
	}
	
	public JPanel createPanel3() {
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
				user.getS1F().setName(s1F.getText());
				user.getS1F().setScoreboard(Integer.parseInt(p1S1.getText()));
				user.getS2F().setName(s2F.getText());
				user.getS2F().setScoreboard(Integer.parseInt(p2S2.getText()));
				compareScore();
//				ImageDialog imageDialog = new ImageDialog();
				setIcon();
				userDAO.inserir(user);
				dispose();
			}
		});
		return button;
	}
	
	public JLabel createLabel(String s) {
		JLabel label=new JLabel(s);
		label.setForeground(Color.WHITE);
		return label;
	}
	
	public JTextField createTextSelection(int columns) {
		JTextField text=new JTextField(columns);
		return text;
	}
	
	public void setJTextField(String aux1,String aux2) {
		this.s1F.setText(aux1);
		this.s2F.setText(aux2);
	}
	
	public void compareScore() {
		if((Integer.parseInt(p1S1.getText()))>(Integer.parseInt(p2S2.getText()))) {
			user.getS1G().setName(s1F.getText());
		}
		else {
			user.getS1G().setName(s2F.getText());
		}	
	}
	
//	public void compareIcons() {
//		Countries[] a= {Countries.ARGENTINA,Countries.BRASIL,Countries.CROACIA,Countries.FRANÇA,
//				Countries.HOLANDA,Countries.INGLATERRA,Countries.MARROCOS,Countries.PORTUGAL};
//		for (Countries countries : a) {
//			if(user.getS1G().getName().equals(countries.getName())) {
//				flag = countries.getFlag();
//			}
//		}
//	}
	public JFrame setIcon() {
		ImageIcon image = null;
		if(user.getS1G().getName().equals("BRA")) {
			image=new ImageIcon("img/brasil.jpg");
		}
		else if(user.getS1G().getName().equals("ARG")) {
			image=new ImageIcon("img/argentina.jpg");
		}
		else if(user.getS1G().getName().equals("CRO")) {
			image=new ImageIcon("img/croacia.jpg");
		}
		else if(user.getS1G().getName().equals("HOL")) {
			image=new ImageIcon("img/holanda.jpg");
		}
		else if(user.getS1G().getName().equals("ING")) {
			image=new ImageIcon("img/inglaterra.jpg");
		}
		else if(user.getS1G().getName().equals("MAR")) {
			image=new ImageIcon("img/marrocos.jpg");
		}
		else{
			image=new ImageIcon("img/portugal.jpg");
		}
		JFrame frame=new JFrame();
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel label=new JLabel(image);
		frame.add(label);
		frame.setLocationRelativeTo(this);
		frame.setVisible(true);
		return frame;
	}
	
//	public static ImageIcon getFlag() {
//		return flag;
//	}

	public User getUser() {
		return this.user;
	}
	
	public UserDAO getUserDAO() {
		return this.userDAO;
	}

}
