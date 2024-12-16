package com.servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regipage")
public class FirstServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String Fname = request.getParameter("fname");
		String Lname = request.getParameter("lname");
		String Email = request.getParameter("email");
		String Password = request.getParameter("password");
		String Address = request.getParameter("address");
		String State = request.getParameter("state");
		String City = request.getParameter("city");
		String Country = request.getParameter("country");
		String Monumber = request.getParameter("mo number");
		String Aadharno = request.getParameter("Aadhar_No");
		String Age = request.getParameter("age");
		String Gender = request.getParameter("gender");
		String Dob = request.getParameter("dob");
		String Degree = request.getParameter("degree");
		String Passingyear = request.getParameter("passing year");
		String Marks = request.getParameter("marks");
		System.out.println(Fname);
		System.out.println(Lname);
		System.out.println(Email);
		System.out.println(Password);
		System.out.println(Address);
		System.out.println(State);
		System.out.println(City);
		System.out.println(Country);
		System.out.println(Monumber);
		System.out.println(Aadharno);
		System.out.println(Age);
		System.out.println(Gender);
		System.out.println(Dob);
		System.out.println(Degree);
		System.out.println(Passingyear);
		System.out.println(Marks);
		
		PrintWriter out =response.getWriter();
		out.println(Fname);
		out.println(Lname);
		out.println(Email);
		out.println(Password);
		out.println(Address);
		out.println(State);
		out.println(City);
		out.println(Country);
		out.println(Monumber);
		out.println(Aadharno);
		out.println(Age);
		out.println(Gender);
		out.println(Dob);
		out.println(Degree);
		out.println(Passingyear);
		out.println(Marks);
		

	}

}
