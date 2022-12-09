package negocio;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import persistencia.UserDAO;

public class SplashWindow extends JFrame{
	private RegistrationWindow registrationWindow;
	
	public SplashWindow() {
		this.registrationWindow=new RegistrationWindow();
		setSize(1400, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(createPanel());
		setVisible(true);
	}
	
	public JPanel createPanel() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(createLabel());
		panel.add(createButtonRegistration());;
		panel.add(createButtonShow());
		panel.add(createButtonImport());
		panel.add(createButtonExport());
		return panel;
	}
	
	public JLabel createLabel() {
		JLabel label=new JLabel();
		label.setForeground(Color.WHITE);
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		label.setText("BOLAO DA COPA");
		return label;
	}
	
	public JButton createButtonRegistration() {
		JButton button=new JButton();
		button.setBackground(Color.WHITE);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.setText("CADASTRAR NOVO BOLAO");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				getRegistrationWindow();
			}
		});
		return button;
	}
	
	public JButton createButtonShow() {
		JButton button=new JButton();
		button.setBackground(Color.WHITE);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.setText("MOSTRAR BOLOES CADASTRADOS");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		return button;
	}
	
	public JButton createButtonImport() {
		JButton button=new JButton();
		button.setBackground(Color.WHITE);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.setText("IMPORTAR BOLOES");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		return button;
	}
	
	public JButton createButtonExport() {
		JButton button=new JButton();
		button.setBackground(Color.WHITE);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.setText("EXPORTAR BOLOES");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				File file = new File("bolaoApostas");
				WriteFile writeFile=new WriteFile();
				String s="";
				for (User a : registrationWindow.getUserDAO().listar()) {
					s+=a.getName()+";"+a.getS1Qf().getName()+";"+a.getS1Qf().getScoreboard()
							+";"+a.getS2Qf().getName()+";"+a.getS2Qf().getScoreboard()+";"+a.getS3Qf().getName()
							+";"+a.getS3Qf().getScoreboard()+";"+a.getS4Qf().getName()+";"+a.getS4Sf().getScoreboard()
							+";"+a.getS5Qf().getName()+";"+a.getS5Qf().getScoreboard()+";"+a.getS6Qf().getName()+";"
							+a.getS6Qf().getScoreboard()+";"+a.getS7Qf().getName()+";"+a.getS7Qf().getScoreboard()+
							";"+a.getS8Qf().getName()+";"+a.getS8Qf().getScoreboard()+";"+a.getS1Sf().getName()
							+";"+a.getS1Sf().getScoreboard()+";"+a.getS2Sf().getName()+";"+a.getS2Sf().getScoreboard()
							+";"+a.getS3Sf().getName()+";"+a.getS3Sf().getScoreboard()+";"+a.getS4Sf().getName()+";"+
									a.getS4Sf().getScoreboard()+";"+a.getS1F().getName()+";"+a.getS1F().getScoreboard()
									+";"+a.getS2F().getName()+";"+a.getS2F().getScoreboard()+";"+a.getS1G().getName()+"\n";
		}
				
				writeFile.Write(s, file);
		}
		});
		
		return button;
	}
	
	public RegistrationWindow getRegistrationWindow() {
		this.registrationWindow.setVisible(true);
		return this.registrationWindow;
	}

}
