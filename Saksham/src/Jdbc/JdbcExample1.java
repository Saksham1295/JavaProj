package Jdbc;

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.SQLException;

class JdbcExample1
{
	
	public static void main(String... args) {
	Connection c = null;
	try{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		c = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
		
		
		 
		if(!c.isClosed())
		{
			System.out.println("Succesfully connected");

		}
		
		Statement stmt = (Statement) c.createStatement();
		String sql = "INSERT INTO Employee VALUES (101, 'Saksham', 21, 180000)";
	    stmt.executeUpdate(sql);
	}	catch(Exception e)
	{
		System.err.println("Eception: "+ e.getMessage());

	}finally{
		try{
			if(c!=null)
				c.close();
		}catch(SQLException e){}
	}
	}
	
}