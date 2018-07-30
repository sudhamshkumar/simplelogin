package com.controller;
import com.model.*;
import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String userid= request.getParameter("userid");
		String firstname= request.getParameter("fname");
		String lastname= request.getParameter("lname");
		String email= request.getParameter("email");
		String password= request.getParameter("pass");
		//int birthday= Integer.parseInt(request.getParameter("bdy"));
		String birthday= request.getParameter("bdy");
		String gender= request.getParameter("gender");
	    AuthRegister ar= new AuthRegister();
	    try {
			boolean reg= ar.createUser(userid, firstname, lastname, email, password, birthday, gender);
			if(reg)
				response.sendRedirect("register.html");
			else
				response.sendRedirect("regerror");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
