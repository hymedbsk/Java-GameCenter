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
	private final JLabel lblPseudo = new JLabel("Pseudo");
	private final JLabel lblMotDePasse = new JLabel("Mot de passe");
	
	public LoginView() {
		setResizable(false);
		initialize();
	}

	private void initialize() {
				
		this.setForeground(new Color(255, 102, 0));
		this.setTitle("Game Center Connexion");
		this.getContentPane().setBackground(Color.WHITE);
		this.setBounds(100, 100, 665, 503);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setForeground(new Color(255, 102, 0));
		btnLogin.setBounds(214, 311, 271, 47);
		this.getContentPane().add(btnLogin);
		
		txtPseudo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtPseudo.setBackground(new Color(255, 102, 0));
		txtPseudo.setForeground(Color.WHITE);
		txtPseudo.setBounds(222, 168, 327, 37);
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
		txtMotDePasse.setForeground(Color.WHITE);
		txtMotDePasse.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtMotDePasse.setColumns(10);
		txtMotDePasse.setBackground(new Color(255, 102, 0));
		txtMotDePasse.setBounds(222, 233, 327, 37);
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
		lblPseudo.setForeground(new Color(255, 102, 0));
		lblPseudo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPseudo.setBounds(122, 172, 90, 33);
		
		getContentPane().add(lblPseudo);
		lblMotDePasse.setForeground(new Color(255, 102, 0));
		lblMotDePasse.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMotDePasse.setBounds(70, 237, 142, 33);
		
		getContentPane().add(lblMotDePasse);
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

	public JTextField getTxtPseudo() {
		return txtPseudo;
	}

	public void setTxtPseudo(JTextField txtPseudo) {
		this.txtPseudo = txtPseudo;
	}

	public JTextField getTxtMotDePasse() {
		return txtMotDePasse;
	}

	public void setTxtMotDePasse(JTextField txtMotDePasse) {
		this.txtMotDePasse = txtMotDePasse;
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}

	public JLabel getLblTitre() {
		return lblTitre;
	}

	public void setLblTitre(JLabel lblTitre) {
		this.lblTitre = lblTitre;
	}

	public JSeparator getSeparator() {
		return separator;
	}

	public void setSeparator(JSeparator separator) {
		this.separator = separator;
	}

	public JButton getBtnSinscrire() {
		return btnSinscrire;
	}

	public void setBtnSinscrire(JButton btnSinscrire) {
		this.btnSinscrire = btnSinscrire;
	}

	public JButton getBtnClassement() {
		return btnClassement;
	}

	public void setBtnClassement(JButton btnClassement) {
		this.btnClassement = btnClassement;
	}

	public JLabel getLblIntro() {
		return lblIntro;
	}

	public void setLblIntro(JLabel lblIntro) {
		this.lblIntro = lblIntro;
	}

	public JLabel getLblPseudo() {
		return lblPseudo;
	}

	public JLabel getLblMotDePasse() {
		return lblMotDePasse;
	}
	 
}
