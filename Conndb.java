package com.student;
import java.sql.*;

public class Conndb 
{
	
	private String username;
	private String URL;
	private String password;

	Connection Connect() throws  SQLException, ClassNotFoundException
	{
		String URL,username,password; 
			Class.forName("org.postgresql.Driver");
			URL="jdbc:postgresql://localhost:5432/postgres";
			username="postgres";
			password="postgres";
			return DriverManager.getConnection(URL,username,password);
	}

}
	
