package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connectionsimple {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb","bjs","123");
     System.out.println("connection Succesfully");
     con.close();
}
}
