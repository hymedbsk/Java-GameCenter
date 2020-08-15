package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;

 
public class BddModel{
	
	private static Connection connection;
	private Statement statement;


 	 
	public BddModel() {
		try		 
		{
		 
			Class.forName("com.mysql.jdbc.Driver");		 
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java" ,"root",""); 		 
			System.out.println("Connection Established");
			
			
			 
		}catch(ClassNotFoundException | SQLException e){
			    System.err.println(e);
		}
	 }


	public static Connection getConnection() {
		return connection;
	}


	public void setConnection(Connection connection) {
		this.connection = connection;
	}


	public Statement getStatement() {
		return statement;
	}


	public void setStatement(Statement statement) {
		this.statement = statement;
	}


	
}