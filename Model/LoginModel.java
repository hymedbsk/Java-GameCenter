package Model;

public class LoginModel {
	
	private String Pseudo;
	private String Password;
	private boolean session = false;
	
	public void verif(String Pseudo, String Password) {
		
		if((this.Pseudo == "hymedbsk" && this.Password == "12345678")) {
			
			session = true;
			System.out.println(session);
			
		}else {
			
			session = false;
			System.out.println(session);
		}
		
	}
	
	public boolean getSession() {
		return session;
	}

}
