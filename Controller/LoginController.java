package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.LoginModel;
import View.LoginView;

public class LoginController {

	private LoginView theView;
	private LoginModel theModel;
	
	public LoginController(LoginView theView, LoginModel theModel) {
		
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.LoginListener(new LoginListener());
		
	}
	
	class LoginListener implements ActionListener{

		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String Pseudo, Password ="";
			
			try {
				
				Pseudo = theView.getPseudo();
				
				
				Password = theView.getPswd();
				
				System.out.println(Pseudo+Password);
				theModel.verif(Pseudo,Password);
				
				System.out.println(theModel.verif());
				
			}catch(NumberFormatException ex){
				
				System.out.println(ex);
				theView.displayErrorMessage("You Need to Enter 2 Integers");
			}
			
		}
		
	}
}
