package com.servlet.example;

import java.sql.*;

public class Connect {
Connection con;
	Connect() throws Exception {
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
}
	Connection ret() {
		return con;
	}
}
