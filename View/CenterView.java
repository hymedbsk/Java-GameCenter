package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;

import Controller.LoginController;
import Model.LoginModel;

public class CenterView extends JFrame  {


	private JLabel lblTitre = new JLabel("Game Center");
	private JSeparator separator = new JSeparator();
	private JLabel lblIntro = new JLabel("Bonjour,");	
	private JButton btnLogout = new JButton("Se d\u00E9connecter");
	private JButton btnSnake = new JButton("Snake");
	private JButton btnDame = new JButton("Jeu de dame");
	private JButton btnEchec = new JButton("Jeu d'\u00E9chec");
	private String pseudo = "";
	/**
	 * 
	 * @param pseudo
	 */
	public CenterView(String Pseudo) {
		
		
		this.setForeground(new Color(255, 102, 0));
		this.setTitle("Game Center ");
		this.getContentPane().setBackground(Color.WHITE);
		this.setBounds(100, 100, 809, 470);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setResizable(false);
		separator.setBackground(new Color(255, 102, 0));
		
		separator.setForeground(new Color(255, 102, 0));
		separator.setBounds(10, 80, 834, 15);
		this.getContentPane().add(separator);
		pseudo = Pseudo;
		lblTitre.setBackground(new Color(255, 102, 0));
		lblTitre.setForeground(new Color(255, 102, 0));
		lblTitre.setFont(new Font("Tahoma", Font.BOLD, 39));
		lblTitre.setBounds(296, 11, 264, 33);
		this.getContentPane().add(lblTitre);
		
		lblIntro.setForeground(new Color(255, 102, 0));
		lblIntro.setFont(new Font("MS PGothic", Font.BOLD, 41));
		lblIntro.setBackground(new Color(255, 102, 0));
		lblIntro.setBounds(90, 106, 172, 42);
		this.getContentPane().add(lblIntro);
		
		JLabel lblNom = new JLabel(Pseudo);
		lblNom.setForeground(new Color(255, 102, 0));
		lblNom.setFont(new Font("MS PGothic", Font.BOLD, 41));
		lblNom.setBackground(new Color(255, 102, 0));
		lblNom.setBounds(252, 106, 592, 42);
		this.getContentPane().add(lblNom);		
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				close();
			}
		});
		
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setOpaque(true);
		btnLogout.setBorder(BorderFactory.createEmptyBorder());
		btnLogout.setForeground(new Color(255, 102, 0));
		btnLogout.setBounds(453, 316, 331, 97);
		btnLogout.setIcon(new ImageIcon(CenterView.class.getResource("/img/logout.png")));
		this.getContentPane().add(btnLogout);		
		btnSnake.setForeground(new Color(255, 102, 0));
		btnSnake.setFont(new Font("Tahoma", Font.BOLD, 20));

		btnSnake.setBackground(Color.WHITE);
		btnSnake.setIcon(new ImageIcon(CenterView.class.getResource("/img/Snake.png")));
		btnSnake.setBounds(20, 197, 331, 97);
		btnSnake.setOpaque(true);
		btnSnake.setBorder(BorderFactory.createEmptyBorder());
		this.getContentPane().add(btnSnake);
		btnDame.setForeground(new Color(255, 102, 0));
		btnDame.setFont(new Font("Tahoma", Font.BOLD, 20));
		
	
				
		btnDame.setBackground(Color.WHITE);
		btnDame.setIcon(new ImageIcon(CenterView.class.getResource("/img/dame.png")));
		btnDame.setOpaque(true);
		btnDame.setBorder(BorderFactory.createEmptyBorder());
		btnDame.setBounds(429, 197, 331, 97);
		this.getContentPane().add(btnDame);
		btnEchec.setForeground(new Color(255, 102, 0));
		btnEchec.setFont(new Font("Tahoma", Font.BOLD, 20));
				
		btnEchec.setIcon(new ImageIcon(CenterView.class.getResource("/img/Chess.png")));
		btnEchec.setOpaque(true);
		btnEchec.setBorder(BorderFactory.createEmptyBorder());
		btnEchec.setBackground(Color.WHITE);
		btnEchec.setBounds(54, 316, 331, 97);
		this.getContentPane().add(btnEchec);
	}
	
	public void SnakeListener(ActionListener ListenerSnake) {
		
		btnSnake.addActionListener(ListenerSnake);
		
		
	}
	
public void LogListener(ActionListener ListenerLog) {
		
		btnLogout.addActionListener(ListenerLog);		
		
	}
	
		public JLabel getLblTitre() {
		return lblTitre;
	}
	
	public JSeparator getSeparator() {
		return separator;
	}
	
	public JLabel getLblIntro() {
		return lblIntro;
	}
	
	public JButton getBtnLogout() {
		return btnLogout;
	}
	
	public JButton getBtnSnake() {
		return btnSnake;
	}
	
	public JButton getBtnDame() {
		return btnDame;
	}
	
	public JButton getBtnEchec() {
		return btnEchec;
	}

	public void close() {
		 this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
		 LoginView logView = new LoginView();		 
		 LoginModel logModel = new LoginModel();
		 LoginController logController = new LoginController(logView,logModel);		 
		 logView.setVisible(true);
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	
}
