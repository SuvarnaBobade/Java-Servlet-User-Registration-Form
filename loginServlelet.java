package com.servletDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginp")
public class loginServlelet  extends HttpServlet{
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String Email = request.getParameter("email");
	String Password = request.getParameter("password");
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "root");
		PreparedStatement ps = c.prepareStatement("select * from registerform where email=? and password=?");
		ps.setString(1, Email);
		ps.setString(2, Password);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			System.out.println("login successfully....!");
			PrintWriter out = response.getWriter();
			out.println("<h1 login successfully....!></h1>");

		}else {
			System.out.println("username and password is not match........");
			PrintWriter out = response.getWriter();
			out.println("login  not successfully....!");

		}
		
		c.close();
	}catch(Exception e){
		
	}
}
}
