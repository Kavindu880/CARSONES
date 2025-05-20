package common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	private static String url = "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12779118";
	private static String userName = "sql12779118";
	private static String password = "an6aM9NJWy";
	private static Connection con;

	public static Connection getConnection() {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url, userName, password);

		} catch (Exception e) {
			System.out.println("Database connection is not success!!!");
		}

		return con;
	}
}
