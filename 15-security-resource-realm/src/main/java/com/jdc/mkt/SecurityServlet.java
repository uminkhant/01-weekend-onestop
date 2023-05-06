package com.jdc.mkt;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {
		"/admin/adminpage",
		"/admin/userTable",
		"/member/memberpage", 
		"/loginForm" })
public class SecurityServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		switch (req.getServletPath()) {
		case "/admin/adminpage":
			req.getRequestDispatcher("adminpage.jsp").forward(req, resp);
			break;
		case "/admin/userTable":
			req.setAttribute("userList", MyResource.getUsers());
			req.getRequestDispatcher("usertable.jsp").forward(req, resp);
			break;
		case "/member/memberpage":
			req.getRequestDispatcher("memberpage.jsp").forward(req, resp);
			break;
		default:
			break;
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		switch (req.getServletPath()) {
		case "/loginForm":

			var user = req.getParameter("loginId");
			var pass = req.getParameter("password");
			
			req.login(user, pass);
			
			var session = req.getSession();
			session.setAttribute("loginUser", req.getUserPrincipal());
			session.setAttribute("isAdmin", req.isUserInRole("Admin"));
			break;
		default:
			break;

		}
		resp.sendRedirect(req.getContextPath());
	}

}
