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

public class LoginView {

	private JFrame frmGameCenterConnexion;
	private JTextField txtPseudo = new JTextField();
	private JTextField txtMotDePasse= new JTextField();
	private JButton btnLogin = new JButton("Se connecter");



	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmGameCenterConnexion = new JFrame();
		frmGameCenterConnexion.setForeground(new Color(255, 102, 0));
		frmGameCenterConnexion.setTitle("Game Center Connexion");
		frmGameCenterConnexion.getContentPane().setBackground(Color.WHITE);
		frmGameCenterConnexion.setBounds(100, 100, 664, 502);
		frmGameCenterConnexion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGameCenterConnexion.getContentPane().setLayout(null);
		
		
		JButton btnLogin = new JButton("Se connecter");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setForeground(new Color(255, 102, 0));
		btnLogin.setBounds(198, 319, 271, 47);
		frmGameCenterConnexion.getContentPane().add(btnLogin);
		
		txtPseudo = new JTextField();
		txtPseudo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtPseudo.setText("Pseudo");
		txtPseudo.setBackground(new Color(255, 102, 0));
		txtPseudo.setForeground(Color.WHITE);
		txtPseudo.setBounds(170, 175, 327, 33);
		frmGameCenterConnexion.getContentPane().add(txtPseudo);
		txtPseudo.setColumns(10);
		
		JLabel lblTitre = new JLabel("Game Center");
		lblTitre.setBackground(new Color(255, 102, 0));
		lblTitre.setForeground(new Color(255, 102, 0));
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 39));
		lblTitre.setBounds(214, 11, 226, 33);
		frmGameCenterConnexion.getContentPane().add(lblTitre);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 102, 0));
		separator.setBounds(10, 80, 628, 15);
		frmGameCenterConnexion.getContentPane().add(separator);
		
		txtMotDePasse = new JTextField();
		txtMotDePasse.setText("Mot de passe");
		txtMotDePasse.setForeground(Color.WHITE);
		txtMotDePasse.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtMotDePasse.setColumns(10);
		txtMotDePasse.setBackground(new Color(255, 102, 0));
		txtMotDePasse.setBounds(170, 251, 327, 33);
		frmGameCenterConnexion.getContentPane().add(txtMotDePasse);
	}
	
	public String getPseudo() {
		System.out.println(txtPseudo.getText());
		return txtPseudo.getText();
	}
	
	public String getPswd() {
		System.out.println(txtMotDePasse.getText());
		return txtMotDePasse.getText();
	}
	
	public void LoginListener(ActionListener listenLogin) {
		
		btnLogin.addActionListener(listenLogin);
		
	}
	 public void displayErrorMessage(String errorMessage){

		  JOptionPane.showInputDialog(this, errorMessage);
		          
	 }

}
