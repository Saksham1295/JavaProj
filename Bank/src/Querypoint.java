import java.sql.*;

public class Querypoint {
Querypoint(Connection c, Takedata td) {
	try{
Statement stmt = c.createStatement();
ResultSet rs = stmt.executeQuery("Select l.rof, b.name from bank b join loan l on (b.bankid = l.bankid and b.bankid = "+td.id+" and l.type ="+td.loan+"");
while(rs.next()) {
	System.out.println(rs.getInt(1));
}
} catch(Exception e) {
	System.out.println(e);
}
}
}
