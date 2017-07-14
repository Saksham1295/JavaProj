package com.servlet.example;

import java.sql.*;

public class Queryput {
Queryput(Connection con,int empid,String name,int age,double salary) throws Exception {
	Statement stmt = con.createStatement();
	stmt.executeUpdate("insert into emp1 values ("+empid+","+name+", "+age+","+salary+")");
	
}
}
