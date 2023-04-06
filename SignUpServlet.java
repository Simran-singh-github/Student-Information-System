package com.student;

import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String s_id = request.getParameter("s_id");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String gender = request.getParameter("gender");
		String mobile = request.getParameter("mobile");
		String address = request.getParameter("address");
		String course = request.getParameter("course");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Student student=new Student();
		
		student.setS_id(Integer.parseInt(s_id));
		student.setFname(fname);
		student.setLname(lname);
		student.setGender(gender);
		student.setMobile(mobile);
		student.setAddress(address);
		student.setCourse(course);
		student.setEmail(email);
		student.setPassword(password);
		
		
		SignUpStudentConn scon = new SignUpStudentConn();
		RequestDispatcher dispatcher=null;
		
		if(scon.main(student))
		{
			dispatcher= request.getRequestDispatcher("index.html");
			request.setAttribute("status", "success");
			dispatcher.forward(request, response);
		}
		else 
		{
			dispatcher= (RequestDispatcher) request.getRequestDispatcher("signup.jsp");
			request.setAttribute("status", "failed");
			dispatcher.forward(request, response);
		}
	
	}

}
