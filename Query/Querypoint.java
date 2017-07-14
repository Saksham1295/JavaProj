package System;
import java.sql.*;

public class Querypoint {
Querypoint(Connection c, Takedata td) {
	try{
Statement stmt = c.createStatement();
ResultSet rs = stmt.executeQuery("Select * from sample");
while(rs.next()) {
	System.out.println(rs.getInt(1));
}
} catch(Exception e) {
	System.out.println(e);
}
}
}
