package Model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BddModel {

	
	public static void main(String[] args) {
		
		try {
			
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "");
			
			Statement myStat = myConn.createStatement();
			
			ResultSet myRs = myStat.executeQuery("select * from utilisateurs");
			
			while(myRs.next()) {
				System.out.println(myRs.getString("Nom")+","+myRs.getString("Prénom")+","+myRs.getString("Pseudo"));
			}
			
		}catch(Exception e){
			
			e.printStackTrace();
		}

	}
	

}
