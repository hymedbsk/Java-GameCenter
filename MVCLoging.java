import Controller.ClassController;
import Controller.LoginController;
import Model.BddModel;
import Model.ClassModel;
import Model.LoginModel;
import View.ClassView;
import View.LoginView;

public class MVCLoging {
	 public static void main(String[] args) {

		
		 BddModel bdd = new BddModel();
		 LoginView logView = new LoginView();
		
		 
		 LoginModel logModel = new LoginModel();
		 LoginController logController = new LoginController(logView,logModel);		 
		 logView.setVisible(true);


	 }

}
