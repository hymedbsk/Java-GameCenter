package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class RegisModel {
	public boolean inscription = false;

	public void inscription(String Pseudo, String Password,String Prenom,String Nom) {
		
	
		ResultSet rs;
		try {
			
			Statement ps = BddModel.getConnection().createStatement();
			
			ps.executeUpdate("INSERT INTO utilisateurs " + 
	                "VALUES ('0','" +Nom+ "', '"+Prenom+"', '"+Pseudo+"', '"+Password+"')");
			inscription = true;		
		} catch (SQLException e) {
			
			inscription = false;	
			JOptionPane.showMessageDialog(null,e);
		}						
	}
	
	public boolean getInscri() {
		
		return inscription;
	}
}
