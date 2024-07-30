package com.jsp.servlet_session_management.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@WebServlet("/profile")
public class ProfileController extends jakarta.servlet.http.HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
		
		HttpSession httpSession = req.getSession();
		
		if(httpSession.getAttribute("userSession") != null) {
			
			resp.sendRedirect("profile.jsp");                           /*.forward(req,resp); */
		}
		else {
			req.setAttribute("msg", "you are not logged in");
					req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
	
	
	
}






