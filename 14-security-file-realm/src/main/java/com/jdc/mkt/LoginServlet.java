package com.jdc.mkt;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/login", "/logout" })
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		switch (req.getServletPath()) {
		case "/logout":
			req.logout();
			req.getSession().invalidate();
			break;
		default:
			break;
		}

		resp.sendRedirect(req.getContextPath());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		switch (req.getServletPath()) {
		case "/login":
			var loginId = req.getParameter("loginId");
			var password = req.getParameter("password");
			
			req.login(loginId, password);

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
