package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClassModel {

	
	PreparedStatement ps;
	ResultSet rs;
	public void classement() {
			
		try {
			String sql = "SELECT * FROM classement ORDER BY Score DESC; ";
			ps = BddModel.getConnection().prepareStatement(sql);
			rs = ps.executeQuery();
			 while (rs.next())    
			  {    
			   //to fetch value from a column having number type of value      
			   int x = rs.getInt("Score");    
			   //to fetch value from a column having varchar/text type of value      
			   String y = rs.getString("Pseudo");    
			   //to fetch value from a column having number type of value      
			   int z = rs.getInt("sal");    
			   System.out.println(x + "   " + y + " " + z);    
			  }    
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	public ResultSet getRs() {
		
		return rs;
	}
}
