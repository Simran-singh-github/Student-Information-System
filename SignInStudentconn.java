package com.student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class SignInStudentconn 
{
	boolean main(Student student) {
		
		Conndb conn = new Conndb();
		String Query="select * from students where email=? and password=?";
		PreparedStatement pst = null;
		ResultSet rs;
		try {
			pst=conn.Connect().prepareStatement(Query);
			pst.setString(1, student.getEmail());
			pst.setString(2, student.getPassword());
			rs=pst.executeQuery();
			rs.next();
			if(rs.getInt("s_id")>=1) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();		
		}
		
		finally {
			try 
			{
				if(pst!=null)
					pst.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		return false;
		}
}
