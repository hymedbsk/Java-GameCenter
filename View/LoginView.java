package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class LoginView extends JFrame{

	private JFrame frmGameCenterConnexion;
	private JTextField txtPseudo = new JTextField();
	private JTextField txtMotDePasse= new JTextField();
	private JButton btnLogin = new JButton("Se connecter");
	private JLabel lblTitre = new JLabel("Game Center");
	private JSeparator separator = new JSeparator();


	public LoginView() {
		initialize();
	}

	private void initialize() {
		
		
		this.setForeground(new Color(255, 102, 0));
		this.setTitle("Game Center Connexion");
		this.getContentPane().setBackground(Color.WHITE);
		this.setBounds(100, 100, 664, 502);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setForeground(new Color(255, 102, 0));
		btnLogin.setBounds(198, 319, 271, 47);
		this.getContentPane().add(btnLogin);
		
		txtPseudo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtPseudo.setText("Pseudo");
		txtPseudo.setBackground(new Color(255, 102, 0));
		txtPseudo.setForeground(Color.WHITE);
		txtPseudo.setBounds(170, 175, 327, 33);
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
		txtMotDePasse.setBounds(170, 251, 327, 33);
		this.getContentPane().add(txtMotDePasse);
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
	 public void displayErrorMessage(String errorMessage){

		  JOptionPane.showInputDialog(this, errorMessage);
		          
	 }

}
