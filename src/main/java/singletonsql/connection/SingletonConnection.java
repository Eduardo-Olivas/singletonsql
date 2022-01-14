package singletonsql.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {

	private static Connection conn;
	
	static
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "test","");
			System.out.println("Database Connection");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println("e.getMessage");
		}
	}
	public static Connection getCon()
	{
		return conn;
	}
	
}
