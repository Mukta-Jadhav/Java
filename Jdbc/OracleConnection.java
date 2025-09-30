package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class OracleConnection {

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		  Class.forName("Oracle.jdbc.driver.OracleDriver");
		  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb","bjs","123");          Statement st=con.createStatement();
		  String Query="Select * from employee";
		  ResultSet Es=st.executeQuery(Query);
		  while(Es.next()) {
			  System.out.println(Es.getInt(1)+" "+Es.getString(2));
		  }
	}

}

