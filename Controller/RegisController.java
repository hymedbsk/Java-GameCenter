package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.RegisModel;
import View.RegisView;


public class RegisController {

	private RegisView regisView;
	private RegisModel regisModel;
	
	public RegisController(RegisView regisView, RegisModel regisModel ) {
		
		this.regisView = regisView;
		this.regisModel = regisModel;		
		this.regisView.RegisListener(new RegisListener());
		
	}
	
	class RegisListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String Nom, Prenom, Pseudo, Password, Password2;
			
			   try {
				
				Pseudo = regisView.getTxtPseudo();								
				Prenom = regisView.getTxtPrenom();
				Nom = regisView.getTxtNom();
				Password = regisView.getTxtMotDePasse();	
				Password2 = regisView.getTxtMotDePasse2();
				if(Password.equals(Password2)) {
					
					regisModel.inscription(Pseudo,Password,Prenom,Nom);
					System.out.println(regisModel.inscription);
					if(regisModel.inscription==true) {
						JOptionPane.showMessageDialog(null,"Votre inscription est validée !");
						regisView.close();
					}
					
				}else {
					JOptionPane.showMessageDialog(null,"Les mots de passe ne correspondent pas.");
					System.out.println("Les mots de passe ne correspondent pas.");
				}
				
			}catch(NumberFormatException ex){
				
				JOptionPane.showMessageDialog(null,ex);
				
			}
		}
		
	}
	
}
