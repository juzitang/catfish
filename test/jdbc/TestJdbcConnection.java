package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestJdbcConnection {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/catfishtest", "root",
				"rxr-6283208");
		PreparedStatement st = conn
				.prepareStatement("select adminID,loginName,name from admin");
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			long id = rs.getLong(1);
			String loginname = rs.getString(2).trim();
			String name = rs.getString(3).trim();
			System.out.println("id is " + id + " and loginname is " + loginname + " and name is " + name);
		}
		
		System.out.println("End-----------------");
	}
}
