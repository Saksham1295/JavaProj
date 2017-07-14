package System;
import java.sql.Connection;

public class Entry {
public static void main(String[] args) {
	Jdbcconnect jd = new Jdbcconnect();
	Connection c = jd.ret();
	Takedata td = new Takedata();
	Querypoint qp = new Querypoint(c,td);
}
}
