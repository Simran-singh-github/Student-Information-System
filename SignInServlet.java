package com.student;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class SignInServlet
 */
@WebServlet("/SignInServlet")
public class SignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Student student = new Student();
		SignInStudentconn sgin = new SignInStudentconn();
		
		student.setEmail(email);
		student.setPassword(password);
		
		RequestDispatcher dispatcher=null;
		
		if(sgin.main(student))
		{
			dispatcher= (RequestDispatcher) request.getRequestDispatcher("Details.jsp");
			request.setAttribute("status", "success");
			dispatcher.forward(request, response);
		}
		else
		{
			out.print("Try Again!!!!!");
		}
	}
}
