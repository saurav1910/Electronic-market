package com.epam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Servlet1() {
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		Person p=new Person();
		System.out.println(name);
		p.setAge(12);
		p.setName(name);
		request.setAttribute("pp", p);
		RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);	
	}

}
