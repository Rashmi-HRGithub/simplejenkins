package practiceprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class db
{
	

	public static void main(String[] args) throws SQLException 
	
	{
		Connection conn=null;
		int result = 0;
		try {
		Driver driverRef =new Driver();
		DriverManager.registerDriver(driverRef);
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		System.out.print("connection is done");
		Statement state = conn.createStatement();
		String query = "insert into studentinfo values"('10','nandini','436486286846');
		result = state.executeUpdate(query);
	}
catch (Exception e) {
	
}
finally {
	if(result==1) {
		System.out.println("student information inserted successfully");
	}
	else {
		System.out.println("student is not inserted");
	}
	
	conn.close();
	System.out.println("-----------close db connection-------");
}

		
}
	
	}


