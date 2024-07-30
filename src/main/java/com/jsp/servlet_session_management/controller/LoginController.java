package com.jsp.servlet_session_management.controller;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(value="/loginContoller")
public class LoginController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException , IOException{
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(username.equalsIgnoreCase("aman")&&password.equalsIgnoreCase("aman@123")) {
			httpSession.setAttribute("userSession", username);
			httpSession.setMaxInactiveIntervaal(60);
			resp.sendRedirect("home.jsp");
		}
		else {
			req.setAttribute("msg", "username/password is Invalid!!");
			
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
	
	
	

}
