package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {
	

	public boolean session = false;
	
	public void verif(String Pseudo, String Password) {
		
		
		PreparedStatement ps;
		ResultSet rs;
		try {
			String sql = "SELECT Pseudo,  password FROM utilisateurs WHERE Pseudo = ? AND password = ?";
			ps = BddModel.getConnection().prepareStatement(sql);
			ps.setString(1, Pseudo);
			ps.setString(2, Password);
			rs = ps.executeQuery();
			if(rs.next())
            {
				session = true;
                    
            }
            else{
                 session = false;
                }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
				
	}
	
	public boolean getSession() {
		return session;
	}

}
