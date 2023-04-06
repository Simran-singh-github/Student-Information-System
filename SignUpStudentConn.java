package com.student;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignUpStudentConn
{
    boolean main(Student student) {
		
		Conndb conn = new Conndb();
		String query="insert into students values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement=null;
		int result;
	
				try
				{
			    preparedStatement = conn.Connect().prepareStatement(query);
			    preparedStatement.setInt(1, student.getS_id());
			    preparedStatement.setString(2, student.getFname());
			    preparedStatement.setString(3, student.getLname());
			    preparedStatement.setString(4, student.getGender());
			    preparedStatement.setString(5, student.getMobile());
			    preparedStatement.setString(6, student.getAddress());
			    preparedStatement.setString(7, student.getCourse());
			    preparedStatement.setString(8, student.getEmail());
			    preparedStatement.setString(9, student.getPassword());
				
			    
			    result = preparedStatement.executeUpdate();
			    if(result>0)
				{
					return true;
				}
				else 
				{
					return false;
				}
		    }
	    catch (Exception e) 
	    {
			System.out.println(e);
		}
	    finally {
			try 
			{
				if(preparedStatement!=null)
					preparedStatement.close();
				} 
			catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
				return false;
		
	}
		
 }



