package System;
import java.sql.*;

public class Jdbcconnect {
	Connection c;
	Jdbcconnect() {
	try{
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","root");
	if(!c.isClosed()) {
		System.out.println("Success");
	}
	
} catch(Exception e) {
	System.out.println(e);
}
}
	Connection ret() {
		return c;
	}
}
