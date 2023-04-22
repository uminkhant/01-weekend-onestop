package com.jdc.mkt;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/counter")
public class CounterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final String 	COUNTER = "counter";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Counter c1 = (Counter) req.getAttribute(COUNTER);		
		if(null == c1 ) {
			c1 = new Counter();
			req.setAttribute(COUNTER, c1);
		} 
		c1.countUp();
		
		var session = req.getSession();
		Counter c2 = (Counter) session.getAttribute(COUNTER);
		if(null == c2) {
			c2 = new Counter();
			session.setAttribute(COUNTER, c2);
		}
		c2.countUp();
		
		var app = getServletContext();
		Counter c3 = (Counter) app.getAttribute(COUNTER);
		if(null == c3) {
			c3 =  new Counter();
			app.setAttribute(COUNTER, c3);
		}
		c3.countUp();
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}

}
