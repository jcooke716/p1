package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	static Connection conn;
	static {
		// establishing connection to postgres database
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	static Connection getConnection() {
		// initializing singular instance of connection object
		if (conn == null) {
			try {
				conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project1", "postgres",
						"password");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
		
	}
	
	static void closeConnection() {
		// severing connection to the database
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
