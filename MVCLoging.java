import Controller.LoginController;
import Model.BddModel;
import Model.LoginModel;
import View.LoginView;
import serpent.Snake;

public class MVCLoging {
	 public static void main(String[] args) {

		
		 BddModel bdd = new BddModel();
		 LoginView logView = new LoginView();
		
		 
		 LoginModel logModel = new LoginModel();
		 LoginController logController = new LoginController(logView,logModel);		 
		 logView.setVisible(true);
		 
		
		
		 //ClassModel classModel  = new ClassModel();
		 //ClassView classView = new ClassView();
		// ClassController classController = new ClassController(classModel,classView);
		 //classView.setVisible(true);

	 }

}
