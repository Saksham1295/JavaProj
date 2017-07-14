package Jd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmpMain {

	
	
	
	public static void main(String args[]){
		
	Connection conn = null;
	try{
		ArrayList<EmpVo> al = new ArrayList<EmpVo>();
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
		//String sql = "SELECT DISTINCT salary FROM Emp1 ORDER BY salary DESC LIMIT 1 OFFSET 5";
		String sql = "SELECT * FROM Emp1 where salary >= 10000";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		EmpAdd obj = new EmpAdd();
		//System.out.println(rs.getInt("EmpNo")+" | "+rs.getString("Name")+" | "+rs.getInt("Age")+" | "+rs.getDouble("Salary"));
			while(rs.next()) {
			int id = rs.getInt("empid");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			double salary = rs.getDouble("salary");
			obj.add(id, name, age, salary);
		}
		
		al = obj.getEmployeeList();
		
		for(EmpVo prl : al) {
			System.out.println(prl.getId()+" "+prl.getName()+ " "+prl.getAge()+" "+prl.getSalary());
		}
		System.out.println("Done");
		
	}catch(Exception e) {
		
		System.out.println(e.getMessage());
		
	}
	
	}
}
