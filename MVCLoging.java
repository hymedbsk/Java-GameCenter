import Controller.LoginController;
import Model.LoginModel;
import View.LoginView;

public class MVCLoging {
	 public static void main(String[] args) {

		 LoginView theView = new LoginView();
		 LoginModel theModel = new LoginModel();
		 LoginController theController = new LoginController(theView,theModel);
		
	 }

}
