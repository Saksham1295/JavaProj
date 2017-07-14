package myJdbc;

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.SQLException;

class GetData
{
	public static void main(String[] args) {
		Connection c = null;
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			String sql = "Select * from Employee where salary >= 190000";
			PreparedStatement stmt= c.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
			System.out.println("\t"+"id: "+rs.getInt("empid")+"\t"+"Name "+rs.getString("name")+"\t"+"Age "+rs.getInt("age")+"\t"+"Salary "+rs.getInt("salary"));
			}
		}catch(Exception e){}
	}	
}