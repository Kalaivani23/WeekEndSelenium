package emp.details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDetails {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// Connect to DB
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
		// Write a SQL Query
		String sql = "Select * from greens";
		// Prepare the statement
		PreparedStatement ps = con.prepareStatement(sql);
		// Execute Query
		ResultSet ex = ps.executeQuery();
		// Iterate the result
		while (ex.next()) {
			String un = ex.getString("username");
			System.out.println(un);

			String pw = ex.getString("password");
			System.out.println(pw);
		}
		// Close the DB Connection
		con.close();
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);

	}
}
