package com.jdc.mkt.communcation;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/forwardTo")
public class ForwardToServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var mess = req.getAttribute("message");
		System.out.println("message : "+mess);
		
		req.getRequestDispatcher("/header").include(req, resp);
		resp.getWriter().append("<p> This is from forwardToServlet </p>");
		req.getRequestDispatcher("/footer").include(req, resp);
	}
}
