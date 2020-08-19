package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class CenterModel {

	
	public void CenterModel(int Score, String pseudo) {
		
		ResultSet rs;
		try {
			
			Statement ps = BddModel.getConnection().createStatement();
			
			ps.executeUpdate("INSERT INTO classement " + 
	                "VALUES ('0','" +pseudo+ "', '"+Score+"')");
				
		} catch (SQLException e) {
			
			
			JOptionPane.showMessageDialog(null,e);
		}						
	}

	
		
	}

