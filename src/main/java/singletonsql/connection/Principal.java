package singletonsql.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {
	
public static void main(String[] args) {

	Connection conn = SingletonConnection.getCon();
	
	try {
		PreparedStatement stat = conn.prepareStatement("Select * from table");
		ResultSet result = stat.executeQuery();
		while(result.next()) {
		System.out.println(result.getString(1)+" | ");
	}
		
	}
	catch(Exception e)
	{
		
	}
	
	}
}


