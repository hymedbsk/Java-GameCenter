package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class LoginView extends JFrame{


	private JTextField txtPseudo = new JTextField();
	private JTextField txtMotDePasse= new JPasswordField();
	private JButton btnLogin = new JButton("Se connecter");
	private JLabel lblTitre = new JLabel("Game Center");
	private JSeparator separator = new JSeparator();
	private JButton btnSinscrire = new JButton("S'inscrire");
	private JButton btnClassement = new JButton("Classement");
	private JLabel lblIntro = new JLabel("Connectes-toi, joue et bats les records pour t'\u00E9lever en haut du classement");
	
	public LoginView() {
		initialize();
	}

	private void initialize() {
				
		this.setForeground(new Color(255, 102, 0));
		this.setTitle("Game Center Connexion");
		this.getContentPane().setBackground(Color.WHITE);
		this.setBounds(100, 100, 665, 503);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setForeground(new Color(255, 102, 0));
		btnLogin.setBounds(199, 309, 271, 47);
		this.getContentPane().add(btnLogin);
		
		txtPseudo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtPseudo.setText("Pseudo");
		txtPseudo.setBackground(new Color(255, 102, 0));
		txtPseudo.setForeground(Color.WHITE);
		txtPseudo.setBounds(170, 163, 327, 33);
		this.getContentPane().add(txtPseudo);
		txtPseudo.setColumns(10);
		
	
		lblTitre.setBackground(new Color(255, 102, 0));
		lblTitre.setForeground(new Color(255, 102, 0));
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 39));
		lblTitre.setBounds(214, 11, 226, 33);
		this.getContentPane().add(lblTitre);
		
		
		separator.setForeground(new Color(255, 102, 0));
		separator.setBounds(10, 80, 628, 15);
		this.getContentPane().add(separator);
		
		txtMotDePasse.setText("Mot de passe");
		txtMotDePasse.setForeground(Color.WHITE);
		txtMotDePasse.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtMotDePasse.setColumns(10);
		txtMotDePasse.setBackground(new Color(255, 102, 0));
		txtMotDePasse.setBounds(170, 237, 327, 33);
		this.getContentPane().add(txtMotDePasse);
		
		
		btnSinscrire.setForeground(new Color(255, 102, 0));
		btnSinscrire.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSinscrire.setBackground(Color.WHITE);
		btnSinscrire.setBounds(10, 405, 271, 47);
		this.getContentPane().add(btnSinscrire);
		
		
		btnClassement.setForeground(new Color(255, 102, 0));
		btnClassement.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClassement.setBackground(Color.WHITE);
		btnClassement.setBounds(367, 405, 271, 47);
		this.getContentPane().add(btnClassement);
		
		
		lblIntro.setForeground(new Color(255, 102, 0));
		lblIntro.setFont(new Font("MS PGothic", Font.BOLD, 20));
		lblIntro.setBackground(new Color(255, 102, 0));
		lblIntro.setBounds(10, 91, 638, 33);
		this.getContentPane().add(lblIntro);
	}
	
	
	public void close() {
		this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
	}
	public String getPseudo() {

		return txtPseudo.getText();
	}
	
	public String getPswd() {
		
		return txtMotDePasse.getText();
	}
	
	public void LoginListener(ActionListener listenLogin) {
		
		btnLogin.addActionListener(listenLogin);
		
	}
	
	public void RegisListener(ActionListener ListenRegis) {
		
		btnSinscrire.addActionListener(ListenRegis);
		
	}
	
	public void ClassListener(ActionListener ListenClass) {
			
		btnClassement.addActionListener(ListenClass);
			
	}
	
	 public void displayErrorMessage(String errorMessage){

		  JOptionPane.showInputDialog(this, errorMessage);
		          
	 }
}
