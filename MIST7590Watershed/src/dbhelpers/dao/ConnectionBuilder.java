package dbhelpers.dao;
/**
 * @author gfalk
 *
 */
import static dbhelpers.Constants.dbName;
import static dbhelpers.Constants.pwd;
import static dbhelpers.Constants.uname;
import static dbhelpers.Constants.url;
import static dbhelpers.Constants.useSSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBuilder {

	private static Connection connection = null;

	public ConnectionBuilder() {
		// TODO Auto-generated constructor stub
	}

	public static Connection connect() {
		// String connectString = url + dbName;
		String connectString = url + dbName + useSSL;
		System.out.println("getting a new connection- " + connectString);
		if (connection == null) {
			// setting up driver

			try {
				System.out.println("trying an Exception");
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				System.out.println("getting the connection" + uname + " " + pwd);
				connection = DriverManager.getConnection(connectString, uname, pwd);
				System.out.println(connection);
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("catching an Exception");
			}
		}
		return connection;
	}

	public static void disconnect() {
		try {
			if (connection != null) {
				connection.close();
				connection = null;
				System.out.println("Disconnected");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
