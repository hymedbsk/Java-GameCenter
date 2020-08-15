package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class RegisView extends JFrame {

	private JLabel lblTitre = new JLabel("Game Center");
	private JButton btnRegis = new JButton("S'inscrire");
	private JTextField txtPseudo = new JTextField();
	private JTextField txtNom = new JTextField();
	private JTextField txtPrenom = new JTextField();
	private JTextField txtMotDePasse= new JPasswordField();
	private JTextField txtMotDePasse2= new JTextField("Comfirmer le mot de Passe");
	private JSeparator separator = new JSeparator();
	private JLabel lblIntro = new JLabel("Inscris-toi, joue et bats les records pour t'\u00E9lever en haut du classement");

	public RegisView() {
		initialize();
	}


	private void initialize() {
		this.setForeground(new Color(255, 102, 0));
		this.setTitle("Game Center Inscription");
		this.getContentPane().setBackground(Color.WHITE);
		this.setBounds(100, 100, 665, 503);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		
		btnRegis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegis.setBackground(Color.WHITE);
		btnRegis.setForeground(new Color(255, 102, 0));
		btnRegis.setBounds(194, 406, 271, 47);
		this.getContentPane().add(btnRegis);
		
		txtPseudo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtPseudo.setText("Pseudo");
		txtPseudo.setBackground(new Color(255, 102, 0));
		txtPseudo.setForeground(Color.WHITE);
		txtPseudo.setBounds(170, 253, 327, 33);
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
		
		txtNom.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtNom.setText("Nom");
		txtNom.setBackground(new Color(255, 102, 0));
		txtNom.setForeground(Color.WHITE);
		txtNom.setBounds(170, 209, 327, 33);
		this.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		txtPrenom.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtPrenom.setText("Prenom");
		txtPrenom.setBackground(new Color(255, 102, 0));
		txtPrenom.setForeground(Color.WHITE);
		txtPrenom.setBounds(170, 165, 327, 33);
		this.getContentPane().add(txtPrenom);
		txtPrenom.setColumns(10);
				
		txtMotDePasse.setText("Mot de passe");
		txtMotDePasse.setForeground(Color.WHITE);
		txtMotDePasse.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtMotDePasse.setColumns(10);
		txtMotDePasse.setBackground(new Color(255, 102, 0));
		txtMotDePasse.setBounds(170, 341, 327, 33);
		this.getContentPane().add(txtMotDePasse);
		
		txtMotDePasse2.setText("Mot de passe");
		txtMotDePasse2.setForeground(Color.WHITE);
		txtMotDePasse2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtMotDePasse2.setColumns(10);
		txtMotDePasse2.setBackground(new Color(255, 102, 0));
		txtMotDePasse2.setBounds(170, 297, 327, 33);
		this.getContentPane().add(txtMotDePasse2);
		
		lblIntro.setForeground(new Color(255, 102, 0));
		lblIntro.setFont(new Font("MS PGothic", Font.BOLD, 20));
		lblIntro.setBackground(new Color(255, 102, 0));
		lblIntro.setBounds(20, 93, 618, 33);
		this.getContentPane().add(lblIntro);
				
	}
	
	public void RegisListener(ActionListener ListenerRegis) {
		
		btnRegis.addActionListener(ListenerRegis);
		
	}
	
	public void close() {
		this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
	}

	public JButton getBtnRegis() {
		return btnRegis;
	}


	public void setBtnRegis(JButton btnRegis) {
		this.btnRegis = btnRegis;
	}


	public String getTxtPseudo() {
		System.out.println(txtPseudo.getText());
		return txtPseudo.getText();
	}


	public void setTxtPseudo(JTextField txtPseudo) {
		this.txtPseudo = txtPseudo;
	}


	public String getTxtNom() {
		return txtNom.getText();
	}


	public void setTxtNom(JTextField txtNom) {
		this.txtNom = txtNom;
	}


	public String getTxtPrenom() {
		return txtPrenom.getText();
	}


	public void setTxtPrenom(JTextField txtPrenom) {
		this.txtPrenom = txtPrenom;
	}


	public String getTxtMotDePasse() {
		return txtMotDePasse.getText();
	}


	public void setTxtMotDePasse(JTextField txtMotDePasse) {
		this.txtMotDePasse = txtMotDePasse;
	}


	public String getTxtMotDePasse2() {
		return txtMotDePasse2.getText();
	}


	public void setTxtMotDePasse2(JTextField txtMotDePasse2) {
		this.txtMotDePasse2 = txtMotDePasse2;
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
	

}