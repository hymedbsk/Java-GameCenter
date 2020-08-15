package Model;

public class LoginModel {
	

	public boolean session = false;
	
	public void verif(String Pseudo, String Password) {
		
		
		if(Pseudo.equals("ok")) {
			
			session = true;
			
		}else {
			
			session = false;
		}
				
	}
	
	public boolean getSession() {
		return session;
	}

}
