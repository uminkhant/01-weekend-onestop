package com.jdc.mkt.listener_demo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet({ "/create", "/remove" })
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private HttpSession session;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		switch(req.getServletPath()) {
		case"/create":
			System.out.println("create session with attribute");
			 session = req.getSession(true);
			session.setAttribute("message", "Testing session attribute");
			break;
		case"/remove":
			System.out.println("remove attirbute and session invalidate");
			if(null != session) {
				session.removeAttribute("message");
			}
			session.invalidate();
			break;
		}
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
		
		

	}

}
