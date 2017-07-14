package myJdbc;

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.SQLException;

class JdbcExample1
{
	public static void main(String[] args) {
		Connection c = null;
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","root");
			
			
			 
			if(!c.isClosed())
			{
				System.out.println("Succesfully connected");

			}
			
			Statement stmt = (Statement) c.createStatement();
			//for(int i=1;i<12;i++)
			//{
			String sql = "INSERT INTO Loan VALUES (6, 'HOME',9.6)";
		    stmt.executeUpdate(sql);
			//}
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
