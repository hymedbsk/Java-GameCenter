package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.CenterModel;
import Model.LoginModel;
import Model.RegisModel;
import View.CenterView;
import View.ClassView;
import View.LoginView;
import View.RegisView;

public class LoginController {

	private LoginView logView;
	private LoginModel logModel;
	
	
	public LoginController(LoginView logView, LoginModel logModel) {
		
		this.logView = logView;
		this.logModel = logModel;
		this.logView.RegisListener(new RegisListener());
		this.logView.LoginListener(new LoginListener());
		this.logView.ClassListener(new ClassListener());
	}
	
	class LoginListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String Pseudo, Password ="";
			
			try {
				
				Pseudo = logView.getPseudo();								
				Password = logView.getPswd();
						
				logModel.verif(Pseudo,Password);
				System.out.println(logModel.session);
				
				if(logModel.session==true) {
					
					JOptionPane.showMessageDialog(null,"Votre êtes connecté !");			
					System.out.println(logModel.getPseudo());					
					CenterView centerView = new CenterView(logModel.getPseudo());
					CenterModel centerModel = new CenterModel();
					CenterController centerController = new CenterController(centerView, centerModel);
					centerView.setVisible(true);							
					logView.close();
										
				}else {
					
					JOptionPane.showMessageDialog(null,"Pseudo ou mot de passe incorrect !");
				}
				
			}catch(NumberFormatException ex){
				
				System.out.println(ex);
				
			}
			
		}
		
	}
	
	class RegisListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			 RegisView regisView = new RegisView();
			 RegisModel regisModel = new RegisModel();
			 RegisController refController = new RegisController(regisView,regisModel);				
			 regisView.setVisible(true);
		}	
	}
	class ClassListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			 ClassView classView = new ClassView();
				
			 classView.setVisible(true);
		}	
	}
}
